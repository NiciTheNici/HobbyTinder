package controller;

import exceptions.CustomExceptions;
import model.User;
import repository.UserCrud;
import repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;
    private final UserCrud userCrud;

    UserController(UserRepository userRepository, UserCrud userCrud) {
        this.userRepository = userRepository;
        this.userCrud = userCrud;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/users")
    Iterable<User> all() {
        return userCrud.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userCrud.save(newUser);
    }

    // Single item

    @GetMapping("/user/{username}")
    User one(@PathVariable String username) {

        return userRepository.findByUsername(username)
                .orElseThrow(() -> new CustomExceptions(username));
    }

    @PostMapping(value = "/auth/login")
    User authUser(HttpServletRequest request,
                  @RequestBody User user
    ) {
        HttpSession httpSession = request.getSession(false);
        if (httpSession != null) {
            return (User) httpSession.getAttribute("user");
        } else {
            Optional<User> optionalUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            if (optionalUser.isPresent()) {
                HttpSession newHttpSession = request.getSession(); //https://stackoverflow.com/questions/595872/under-what-conditions-is-a-jsessionid-created
                newHttpSession.setAttribute("user", optionalUser.get());
                return optionalUser.get();
            } else return null;
        }


    }
//
//	@PutMapping("/user/{id}")
//	User replaceUser(@RequestBody User newUser, @PathVariable Long id) {1
//
//		return repository.findById(id)
//			.map(user -> {
//				user.setUsername(newUser.getUsername());
//				user.setPassword(newUser.getPassword());
//				return repository.save(user);
//			})
//			.orElseGet(() -> {
//				newUser.setId(id);
//				return repository.save(newUser);
//			});
//	}
//
//	@DeleteMapping("/user/{id}")
//	void deleteUser(@PathVariable Long id) {
//		repository.deleteById(id);
//	}
}
