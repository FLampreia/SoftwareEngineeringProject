package pt.estgd.api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "curricularUnit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurricularUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @OneToMany(mappedBy = "curricularUnit")
    private Set<Classes> classes;

    @ManyToMany(mappedBy = "curricularUnits")
    private Set<User> students;


}
