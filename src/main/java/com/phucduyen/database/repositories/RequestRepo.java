package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepo extends JpaRepository<Request, Integer> {
}
