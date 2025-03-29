package edu.iu.p466.arithmetic_service.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping("/")
    public String greetings() {
        System.out.println("Neeha");
        return "Welcome to the Arithmetic Services!";

    }

    @GetMapping("/add/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m) {
        return n + m;
    }

}
