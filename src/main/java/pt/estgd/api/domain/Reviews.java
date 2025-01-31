package pt.estgd.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "participation_Reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int value;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;


    @ManyToOne
    @JoinColumn(name = "participation_type_id")
    private ParticipationType participationType;


}
