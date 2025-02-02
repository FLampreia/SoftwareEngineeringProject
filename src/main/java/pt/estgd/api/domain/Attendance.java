package pt.estgd.api.domain;


import jakarta.persistence.*;


import java.io.Serial;
import java.util.Set;

@Entity
@Table(name = "attendance")

public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes classes;

    @OneToMany(mappedBy = "attendance",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Reviews> reviews;

}
