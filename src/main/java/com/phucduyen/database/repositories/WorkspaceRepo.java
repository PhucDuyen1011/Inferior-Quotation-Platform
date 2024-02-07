package com.phucduyen.database.repositories;

import com.phucduyen.database.models.entity_models.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkspaceRepo extends JpaRepository<Workspace, Integer> {
}
