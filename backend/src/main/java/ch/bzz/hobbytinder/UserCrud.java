package ch.bzz.hobbytinder;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserCrud extends CrudRepository<User, Long> {
}
