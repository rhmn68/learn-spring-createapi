package com.rahmanaulia.learnapi.services;

import com.rahmanaulia.learnapi.models.entities.Product;
import com.rahmanaulia.learnapi.models.entities.Supplier;
import com.rahmanaulia.learnapi.repos.ProductRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);
        if (product.isEmpty()){
            return null;
        }
        return product.get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    public List<Product> findByName(String name){
        return productRepo.findByNameContains(name);
    }

    public void addSupplier(Supplier supplier, Long productId){
        Product product = findOne(productId);
        if (product == null){
            throw new RuntimeException("Product with ID: " + productId + " not found");
        }
        product.getSuppliers().add(supplier);
        save(product);
    }
}
