package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRequestRepo extends JpaRepository<UserRequest, Integer> {
}
