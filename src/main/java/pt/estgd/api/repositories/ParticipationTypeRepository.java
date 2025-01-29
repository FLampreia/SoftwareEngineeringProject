package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.ParticipationType;

public interface ParticipationTypeRepository extends JpaRepository<ParticipationType, String> {
}
