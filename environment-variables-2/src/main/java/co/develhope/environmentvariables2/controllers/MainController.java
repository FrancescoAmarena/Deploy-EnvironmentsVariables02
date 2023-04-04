package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${myCustomEnvs.welcomeMsg}")
    String welcome;

    @GetMapping("/welcomeMsg")
    public String messages(){
        return welcome;
    }

}