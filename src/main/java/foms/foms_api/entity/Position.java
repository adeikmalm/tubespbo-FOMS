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

    @Column(name = "level_id")
    private String levelId;

    @Column(name = "officer_id")
    private String officerId;

    @Column(name = "basic_salary")
    private Double basicSalary;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_at")
    private String updatedAt;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Company company;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Level> levels;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Officer> officers;
}


