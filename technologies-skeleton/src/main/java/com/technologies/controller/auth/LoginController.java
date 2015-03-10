package com.technologies.controller.auth;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String showLogin(@RequestParam(value = "login_error", defaultValue = "") String login_error,
			Model model) {
		if (StringUtils.isNotBlank(login_error)) {
			model.addAttribute("error", true);
		}
		return "login";
	}
}
