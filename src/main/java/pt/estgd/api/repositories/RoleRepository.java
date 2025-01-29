package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
