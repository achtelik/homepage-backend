package it.achtelik.homepage.homepagebackend.usecases.page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Page {

    @GetMapping()
    public String get(){
        return "Hello!";
    }
    
}
