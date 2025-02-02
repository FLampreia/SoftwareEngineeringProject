package pt.estgd.api.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "classes")

public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dateTime;
    private String Summary;

    @ManyToOne
    @JoinColumn(name = "curricular_Unit_id")
    private CurricularUnit curricularUnit;

    @OneToMany(mappedBy = "classes")
    private Set<Attendance> attendances;
}
