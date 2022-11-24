package com.rahmanaulia.learnapi.services;

import com.rahmanaulia.learnapi.models.entities.Category;
import com.rahmanaulia.learnapi.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;
import java.util.Optional;

@Service
@TransactionScoped
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public Category findOne(Long id){
        Optional<Category> category = categoryRepo.findById(id);
        return category.orElse(null);
    }

    public Iterable<Category> findAll(){
        return categoryRepo.findAll();
    }

    public void removeOne(Long id){
        categoryRepo.deleteById(id);
    }
}
