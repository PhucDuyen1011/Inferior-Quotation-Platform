package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
