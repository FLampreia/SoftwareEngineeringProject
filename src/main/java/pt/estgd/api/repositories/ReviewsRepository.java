package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}
