package foms.foms_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")

public class User {
    @Id
    private String id;

    private String email;

    private String password;

    private String role;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_at")
    private String updatedAt;
}


