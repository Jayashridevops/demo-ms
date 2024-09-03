package com.example.demo_ms;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {
        return "Please book your bus ticket from  app on 35% discount" ;
    }
}
