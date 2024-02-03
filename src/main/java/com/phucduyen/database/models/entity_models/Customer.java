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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String idCard;

    @OneToOne //lý do mqh 1-1 chỉ gắn 1 bên, vì ko phải lúc nào account cũng sẽ có cus
                //cus có gắn mqh là do nó phụ thuộc vào account
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "customer")
    private List<Request> requests;
}
