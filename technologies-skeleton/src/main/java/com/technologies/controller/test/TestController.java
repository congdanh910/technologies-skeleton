package com.technologies.controller.test;

import java.io.IOException;

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
}
