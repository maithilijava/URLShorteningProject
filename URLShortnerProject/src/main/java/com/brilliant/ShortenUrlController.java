package com.brilliant;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ShortenUrlController {
	
	@GetMapping("/")
	public String loadIndex() {
		return "index";
	}

}
