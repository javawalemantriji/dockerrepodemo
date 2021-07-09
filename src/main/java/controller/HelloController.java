package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/")
	public String show() {
		return "WELCOME DOCKER NP DJSFJDJDFJ.....................||||||||||||";
	}

}
