package repository;

import model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrud extends CrudRepository<User, Long> {
    Optional<User> getUserByUsername(String username);
}
