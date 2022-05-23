package com.inti.SpringBootThymleafValidation.controller.copy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControllerPrAffichage {

	
	@GetMapping("hello")
	public String hello()
	{
		return "hello";
	}
	
	
	
}
