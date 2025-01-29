package pt.estgd.api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private LocalDateTime dateTime;
    private String Summary;

    @ManyToOne
    @JoinColumn(name = "curricularUnit_id")
    private CurricularUnit curricularUnit;

    @OneToMany(mappedBy = "classes")
    private Set<Attendance> attendances;
}
