package com.springboot.app;

import java.time.LocalDate;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	 @GetMapping("")
	    public String index(Model model) {

	        return "home is where";
	    }

}
