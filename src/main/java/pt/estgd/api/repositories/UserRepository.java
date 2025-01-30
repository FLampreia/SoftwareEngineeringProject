package pt.estgd.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import pt.estgd.api.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    UserDetails findByEmail(String email);
}
