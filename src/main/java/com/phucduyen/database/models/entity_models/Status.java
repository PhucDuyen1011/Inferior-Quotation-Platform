package com.phucduyen.database.models.entity_models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue
    private Integer id;

    private String type;

    @OneToMany(mappedBy = "status")
    private List<StatusRequest> statusRequestList;
}
