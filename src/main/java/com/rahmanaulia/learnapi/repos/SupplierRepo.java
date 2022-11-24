package com.rahmanaulia.learnapi.repos;

import com.rahmanaulia.learnapi.models.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {
}
