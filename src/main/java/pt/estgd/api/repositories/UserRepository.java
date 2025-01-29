package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.estgd.api.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String Email);
}
