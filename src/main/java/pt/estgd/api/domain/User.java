package pt.estgd.api.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "user_role")
    private Role role;

    @ManyToMany
    @JoinTable(
            name = "user_curricularUnits",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "unit_id")
    )
    private Set<CurricularUnit> curricularUnits;
}
