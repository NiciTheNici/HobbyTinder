package myTrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"controller", "myTrade"})
@EnableJpaRepositories("repository") // defines location of all repository stuff
@EntityScan("model") //needed for spring to know where models are
public class MyTradeApplication {

    public static void main(String... args) {
        SpringApplication.run(MyTradeApplication.class, args);
    }
}
