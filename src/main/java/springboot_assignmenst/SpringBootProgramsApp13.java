package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp13 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp13.class, args);
    }
}
/* 1. POST – Add a new book
URL: http://localhost:8081/user13/add
Method: POST
Body → raw → JSON:

json
Copy code
{
  "bookid": 1,
  "bookname": "Spring Boot Basics",
  "author": "John Smith",
  "price": 499.99
}
2. GET – Get all books
URL: http://localhost:8081/user13/getall
Method: GET
Response:

json
Copy code
[
  {
    "bookid": 1,
    "bookname": "Spring Boot Basics",
    "author": "John Smith",
    "price": 499.99
  },
  ...
]
3. GET – Get a single book by ID
URL: http://localhost:8081/user13/get/1
Method: GET
Response:

json
Copy code
{
  "bookid": 1,
  "bookname": "Spring Boot Basics",
  "author": "John Smith",
  "price": 499.99
}
4. PUT – Update a book
URL: http://localhost:8081/user13/update
Method: PUT
Body → raw → JSON:

json
Copy code
{
  "bookid": 1,
  "bookname": "Spring Boot Updated",
  "author": "Jane Doe",
  "price": 599.99
}
Note: bookid must already exist in the database for this to work.

5. DELETE – Delete a book by ID
URL: http://localhost:8081/user13/delete/1
Method: DELETE
Response:

sql
Copy code
Deleted user with bookid: 1
*/
