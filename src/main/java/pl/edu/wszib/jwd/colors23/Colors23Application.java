package pl.edu.wszib.jwd.colors23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db.properties")
@SpringBootApplication
public class Colors23Application {

    public static void main(String[] args) {
        SpringApplication.run(Colors23Application.class, args);
    }

}
