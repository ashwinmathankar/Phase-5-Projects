package com.org;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/aws")
public class Controller {

	@GetMapping("/")
	public String Hello()
	{
		return "Hello from AWS";
	}
	
}
