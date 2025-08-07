package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp11 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp11.class, args);
    }
}
/*
http://localhost:8081/users



<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<userListWrapper>
    <users>
        <dateOfBirth>1999-01-01</dateOfBirth>
        <email>mahesh@gmail.com</email>
        <firstName>Mahesh</firstName>
        <id>1</id>
        <lastName>Koppoku</lastName>
        <mobile>9876543210</mobile>
    </users>
    <users>
        <dateOfBirth>1990-05-15</dateOfBirth>
        <email>john@example.com</email>
        <firstName>John</firstName>
        <id>2</id>
        <lastName>Doe</lastName>
        <mobile>9988776655</mobile>
    </users>
    <users>
        <dateOfBirth>1992-07-20</dateOfBirth>
        <email>jane@example.com</email>
        <firstName>Jane</firstName>
        <id>3</id>
        <lastName>Smith</lastName>
        <mobile>9090909090</mobile>
    </users>
</userListWrapper>

in JSON formate

{
    "users": [
        {
            "id": 1,
            "firstName": "Mahesh",
            "lastName": "Koppoku",
            "email": "mahesh@gmail.com",
            "mobile": "9876543210",
            "dateOfBirth": "1999-01-01"
        },
        {
            "id": 2,
            "firstName": "John",
            "lastName": "Doe",
            "email": "john@example.com",
            "mobile": "9988776655",
            "dateOfBirth": "1990-05-15"
        },
        {
            "id": 3,
            "firstName": "Jane",
            "lastName": "Smith",
            "email": "jane@example.com",
            "mobile": "9090909090",
            "dateOfBirth": "1992-07-20"
        }
    ]
}
*/