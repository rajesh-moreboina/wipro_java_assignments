package springboot_assignmenst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot_assignmenst.model.User13;
import springboot_assignmenst.repository.User13Repository;

import java.util.List;

@Service
public class User13Service {

    @Autowired
    private User13Repository repository;

    public User13 saveUser(User13 user) {
        return repository.save(user);
    }

    public List<User13> getAllUsers() {
        return repository.findAll();
    }

    public User13 getUserById(int bookid) {
        return repository.findById(bookid).orElse(null);
    }

    public String deleteUser(int bookid) {
        repository.deleteById(bookid);
        return "Deleted user with bookid: " + bookid;
    }

    public User13 updateUser(User13 user) {
        return repository.save(user);
    }
}
