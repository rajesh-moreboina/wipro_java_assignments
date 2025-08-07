package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp12 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp12.class, args);
    }
}

/*
http://localhost:8081/book12/add(use psot)
{
"bookid": 1,
"bookname": "Core Java",
"author": "James Gosling",
"price": 450.0
}

GET http://localhost:8081/book12/all

[
    {
        "bookid": 1,
        "bookname": "Java Book",
        "author": "James",
        "price": 500.0
    },
    {
        "bookid": 2,
        "bookname": "Spring Boot",
        "author": "Pivotal",
        "price": 450.0
    },
    {
        "bookid": 3,
        "bookname": "Hibernate",
        "author": "Gavin",
        "price": 400.0
    },
    {
        "bookid": 4,
        "bookname": "Java Book",
        "author": "James",
        "price": 500.0
    }
]
*/