package com.example.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.product;

public interface ProductRepository extends JpaRepository<product, Long> {
// Custom method (optional)
    List<product> findByCategory(String category);
}

    








