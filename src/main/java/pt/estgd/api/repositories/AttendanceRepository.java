package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}
