package com.technologies.controller.test;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class TestController {

	@RequestMapping("/test")
	public void test(HttpServletResponse response) throws IOException {
		response.getWriter().write("This is test controller!!!");
	}
}
