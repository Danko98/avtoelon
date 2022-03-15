package uz.dostim.avtoelon.user;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dostim.avtoelon.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
