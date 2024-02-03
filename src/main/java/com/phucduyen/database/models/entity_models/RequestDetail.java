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
@Table(name = "request_detail")
public class RequestDetail {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "requestDetail")
    private List<StatusRequest> statusRequestList;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;


}
