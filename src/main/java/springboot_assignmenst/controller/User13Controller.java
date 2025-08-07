package springboot_assignmenst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot_assignmenst.model.User13;
import springboot_assignmenst.service.User13Service;

import java.util.List;

@RestController
@RequestMapping("/user13")
public class User13Controller {

    @Autowired
    private User13Service service;

    @PostMapping("/add")
    public User13 addUser(@RequestBody User13 user) {
        return service.saveUser(user);
    }

    @GetMapping("/getall")
    public List<User13> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/get/{bookid}")
    public User13 getUserById(@PathVariable int bookid) {
        return service.getUserById(bookid);
    }

    @PutMapping("/update")
    public User13 updateUser(@RequestBody User13 user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/delete/{bookid}")
    public String deleteUser(@PathVariable int bookid) {
        return service.deleteUser(bookid);
    }
}
