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
@Table(name = "employee")

public class Employee {
    @Id
    private String id;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "position_id")
    private String positionId;

    private String nip;

    private String name;

    private String tmt;

    private String gender;

    @Column(name = "whatsapp_number")
    private String whatsappNumber;

    private String email;

    @Column(name = "logo_uri")
    private String logoUri;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_at")
    private String updatedAt;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "positon_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Position position;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Salary> salaries;
}

// pradipa

