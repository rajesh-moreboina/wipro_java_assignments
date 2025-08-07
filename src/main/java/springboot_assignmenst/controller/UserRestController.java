package springboot_assignmenst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_assignmenst.model.User11;
import springboot_assignmenst.model.UserListWrapper;

import java.util.Arrays;

@RestController
public class UserRestController {

    //@GetMapping(value = "/users", produces = "application/xml")
	@GetMapping(value = "/users", produces = "application/json")

    public UserListWrapper getAllUsers() {
        return new UserListWrapper(Arrays.asList(
                new User11(1, "Mahesh", "Koppoku", "mahesh@gmail.com", "9876543210", "1999-01-01"),
                new User11(2, "John", "Doe", "john@example.com", "9988776655", "1990-05-15"),
                new User11(3, "Jane", "Smith", "jane@example.com", "9090909090", "1992-07-20")
        ));
    }
}
