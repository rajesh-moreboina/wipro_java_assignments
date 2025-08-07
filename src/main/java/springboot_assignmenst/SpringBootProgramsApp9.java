package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "springboot_assignmenst")
public class SpringBootProgramsApp9  {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp9 .class, args);
    }
}

/*
 postman  http://localhost:8081/books

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<list>
    <item>
        <bookId>101</bookId>
        <name>Java Programming</name>
        <writer>James Gosling</writer>
    </item>
    <item>
        <bookId>102</bookId>
        <name>Spring Boot</name>
        <writer>Pivotal</writer>
    </item>
    <item>
        <bookId>103</bookId>
        <name>Hibernate</name>
        <writer>Gavin King</writer>
    </item>
</list>
*/