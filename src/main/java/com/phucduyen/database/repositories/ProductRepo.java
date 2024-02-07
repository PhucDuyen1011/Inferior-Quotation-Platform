package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
