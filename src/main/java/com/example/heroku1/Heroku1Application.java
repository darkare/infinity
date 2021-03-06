package com.example.heroku1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Heroku1Application {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World 100";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Heroku1Application.class, args);
	}
}
