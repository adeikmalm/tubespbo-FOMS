package foms.foms_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "position")

public class Position {
    @Id
    private String id;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "basic_salary")
    private Double basicSalary;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;
}


