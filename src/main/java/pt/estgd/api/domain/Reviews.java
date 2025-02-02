package pt.estgd.api.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "participation_Reviews")

public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int value;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "attendance_id")
    private Attendance attendance;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ParticipationType participationType;


}
