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
@Table(name = "quotation")
public class Quotation {
    @Id
    @GeneratedValue
    private Integer id;

    private String detail;
    private float incurredFee;
    private int quantity;
    private float total;

    @OneToMany(mappedBy = "quotation")
    private List<StatusRequest> statusRequestList;
}
