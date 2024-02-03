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
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private float width;
    private float length;
    private float price;

    @OneToMany(mappedBy = "product")
    private List<RequestDetail> requestDetailList;

    @OneToMany(mappedBy = "product")
    private List<Workspace> workspaceList;

    @OneToMany(mappedBy = "product")
    private List<ProductMaterial> productMaterialList;
}
