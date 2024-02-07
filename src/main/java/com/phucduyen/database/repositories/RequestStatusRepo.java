package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestStatusRepo extends JpaRepository<RequestStatus, Integer> {
}
