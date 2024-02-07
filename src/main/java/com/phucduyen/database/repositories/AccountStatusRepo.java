package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountStatusRepo extends JpaRepository<AccountStatus, Integer> {

}
