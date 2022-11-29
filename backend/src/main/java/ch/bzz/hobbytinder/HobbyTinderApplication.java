package ch.bzz.hobbytinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("repo")
@EntityScan("model")
@ComponentScan("repo")
public class HobbyTinderApplication {

    public static void main(String[] args) {
        System.out.println("test");
        SpringApplication.run(HobbyTinderApplication.class, args);
    }

}
