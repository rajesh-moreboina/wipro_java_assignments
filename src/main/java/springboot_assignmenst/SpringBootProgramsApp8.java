package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp8 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp8.class, args);
    }
}

/*
http://localhost:8081/api/greet/Rajesh?msg=GoodMorning

GoodMorning, Rajesh!
*/