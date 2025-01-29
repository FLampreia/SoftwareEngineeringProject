package pt.estgd.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "participationReviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int value;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;


    @ManyToOne
    @JoinColumn(name = "participationType_id")
    private ParticipationType participationType;


}
