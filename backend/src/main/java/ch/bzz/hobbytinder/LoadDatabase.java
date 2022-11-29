package ch.bzz.hobbytinder;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  public CommandLineRunner initDatabase(UserCrud userCrud) {

    return args -> {
      User nici = new User("nici", "paZZw0rd", new Date(), "admin", "asdf");
      log.info("Preloading " + userCrud.save(nici));
    };
  }
}
