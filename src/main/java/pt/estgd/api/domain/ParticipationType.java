package pt.estgd.api.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "participation")

public class ParticipationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    private String description;
}
