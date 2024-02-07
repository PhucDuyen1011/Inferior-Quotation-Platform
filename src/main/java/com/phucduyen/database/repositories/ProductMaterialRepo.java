package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.ProductMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMaterialRepo extends JpaRepository<ProductMaterial, Integer> {
}
