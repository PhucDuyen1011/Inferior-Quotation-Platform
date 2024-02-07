package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepo extends JpaRepository<Material, Integer> {
}
