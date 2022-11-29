package ch.bzz.hobbytinder.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import ch.bzz.hobbytinder.model.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
