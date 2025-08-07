package springboot_assignmenst.controller;

import springboot_assignmenst.model.EnrollmentForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
public class EnrollmentController {

    @GetMapping("/enroll")
    public String showForm(Model model) {
        model.addAttribute("enrollmentForm", new EnrollmentForm());
        model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
        model.addAttribute("countries", Arrays.asList("INDIA", "USA", "CANADA"));
        model.addAttribute("subjects", Arrays.asList("Physics", "Life Science", "Political Science"));
        return "enroll";
    }

    @PostMapping("/enroll")
    public String submitForm(@Valid @ModelAttribute("enrollmentForm") EnrollmentForm form,
                             BindingResult result,
                             Model model) {
        model.addAttribute("sections", Arrays.asList("Graduate", "Post Graduate", "Research"));
        model.addAttribute("countries", Arrays.asList("INDIA", "USA", "CANADA"));
        model.addAttribute("subjects", Arrays.asList("Physics", "Life Science", "Political Science"));

        if (result.hasErrors()) {
            return "enroll";
        }
        return "success1";
    }
}
