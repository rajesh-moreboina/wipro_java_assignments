package springboot_assignmenst.controller;

import springboot_assignmenst.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm(Model model) {
        // Bind a new empty User object to the form
        model.addAttribute("user", new User());
        return "register";  // Will render register.html from templates/
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        // user object is automatically filled with form data
        model.addAttribute("user", user);
        return "success";  // Will render success.html from templates/
    }
}
