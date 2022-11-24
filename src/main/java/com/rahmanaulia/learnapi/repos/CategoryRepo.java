package com.rahmanaulia.learnapi.repos;

import com.rahmanaulia.learnapi.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
