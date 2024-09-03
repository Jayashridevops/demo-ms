package com.example.demo_ms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class cab {
    @GetMapping("/cab")
    public String getData() {
        return "Please book your cab ticket from  app on 50% discount" ;
    }
}
