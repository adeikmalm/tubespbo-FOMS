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
@Table(name = "company")

public class Company {
    @Id
    private String id;

    private String name;

    private String address;

    private String code;

    @Column(name = "logo_uri")
    private String logoUri;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_at")
    private String updatedAt;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Position> positions;

}


