package com.phucduyen.database.models.entity_models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employee_request")
public class EmployeeRequest {
    @Id
    @GeneratedValue//do sài SQL server nên ghi như v được: tương ứng với GeneratedValue.Identity
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private Request request;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employee employee;
}
