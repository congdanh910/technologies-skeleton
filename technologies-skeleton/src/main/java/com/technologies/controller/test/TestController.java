package com.technologies.controller.test;

import java.io.IOException;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class TestController {

	@RequestMapping("/test")
	public String test(Model model) throws IOException {
		model.addAttribute("test","This is test controller!!!");
		return "test";
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/loginOkAdmin")
	public String loginOkAdmin(Model model) throws IOException {
		model.addAttribute("test","Admin logins ok!!!");
		return "test";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/loginOkUser")
	public String loginOkUser(Model model) throws IOException {
		model.addAttribute("test","User logins ok!!!");
		return "test";
	}
}


