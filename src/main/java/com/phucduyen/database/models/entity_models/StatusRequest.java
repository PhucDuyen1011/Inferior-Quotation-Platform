package com.phucduyen.database.models.entity_models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "status_request")
public class StatusRequest {
    @Id
    @GeneratedValue
    private Integer id;

    private Date dateBegin;
    private Date dateEnd;

    @ManyToOne
    @JoinColumn(name = "quotation_id")
    private Quotation quotation;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "request_detail_id")
    private RequestDetail requestDetail;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
