package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.CurricularUnit;

public interface CurricularUnitRepository extends JpaRepository<CurricularUnit, Integer> {
}
