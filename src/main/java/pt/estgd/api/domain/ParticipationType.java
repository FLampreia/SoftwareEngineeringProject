package pt.estgd.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "participation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipationType {
    @Id
    private String name;

    private String description;
}
