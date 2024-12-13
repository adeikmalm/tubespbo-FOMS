package foms.foms_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "level")

public class Level {
    @Id
    private String id;

    @Column(name = "position_id")
    private String positionId;

    private String name;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_at")
    private String updatedAt;

    @ManyToOne
    @JoinColumn(name = "positon_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Position position;
}


