package pt.estgd.api.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "participation_Reviews")

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
