package springboot_assignmenst.controller;

import org.springframework.web.bind.annotation.*;
import springboot_assignmenst.model.Greeting;  // ✅ this is required

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name) {
        return "Hi, " + name + "!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, @RequestParam String msg) {
        return msg + ", " + name + "!";
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody Greeting greeting) {
        return greeting.getMessage() + ", " + greeting.getName() + "!";
    }
}
