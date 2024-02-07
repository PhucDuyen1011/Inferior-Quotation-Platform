package com.phucduyen.database.models.entity_models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String address;
    private Date createDate;
    private Date endDate;
    private float totalPrice;
    private String description;
    private boolean type;

    @OneToMany(mappedBy = "request")
    private List<UserRequest> userRequestList;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "requestStatus_id")
    private RequestStatus requestStatus;

    @OneToMany(mappedBy = "request")
    private List<Workspace> workspaceList;
}
