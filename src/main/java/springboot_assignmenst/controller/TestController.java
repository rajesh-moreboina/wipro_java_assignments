package springboot_assignmenst.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/users/{id}/accounts")
    public String display(
            @PathVariable int id,
            @RequestParam String type,
            @RequestParam String status) {

        System.out.println("User ID       : " + id);
        System.out.println("Account Type  : " + type);
        System.out.println("Status        : " + status);

        return "Printed in Console";
    }
}
