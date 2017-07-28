package devtoolstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(Application.class.getResource("/application.properties"));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        SpringApplication.run(Application.class, args);
    }
}
