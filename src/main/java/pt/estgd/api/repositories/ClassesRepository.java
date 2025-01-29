package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.Classes;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
}
