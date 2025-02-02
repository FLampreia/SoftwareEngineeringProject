package pt.estgd.api.domain;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name = "curricular_Unit")

public class CurricularUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @OneToMany(mappedBy = "curricularUnit")
    private Set<Classes> classes;

    @ManyToMany(mappedBy = "curricularUnits")
    private Set<User> students;


}
