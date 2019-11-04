package fr.epita.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication(scanBasePackages="fr.epita")
//@EnableJpaRepositories("fr.epita")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
