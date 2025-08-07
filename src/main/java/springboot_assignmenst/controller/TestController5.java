package springboot_assignmenst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController5 {

    @GetMapping("/test")
    public String test() {
        // This redirects to /test2
        return "redirect:/test2";
    }

    @GetMapping("/test2")
    @ResponseBody
    public String test2() {
        return "this is test2 method";
    }
}
