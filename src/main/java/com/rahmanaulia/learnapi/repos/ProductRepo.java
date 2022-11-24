package com.rahmanaulia.learnapi.repos;

import com.rahmanaulia.learnapi.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CrudRepository<Model, Tipe Data Id Model>
 * */
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByNameContains(String name);

}
