package myTrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.UserCrud;

import model.User;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(UserCrud userCrud) {

        return args -> {
            User nici = new User("nici", "nicolas", new Date, "password", "admin");
            log.info("Preloading: " + userCrud.save(nici));

        };
    }
}
