package springboot_assignmenst.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import springboot_assignmenst.model.User10;

@Controller
public class FormController10 {

    @GetMapping("/form10")
    public String showForm(Model model) {
        model.addAttribute("user1", new User10());
        return "register10";
    }

    @PostMapping("/submit10")
    public String submitForm(@Valid @ModelAttribute("user1") User10 user1,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "register10";
        }
        return "success10";
    }
}
