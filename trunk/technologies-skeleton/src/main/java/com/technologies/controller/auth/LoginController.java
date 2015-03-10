package com.technologies.controller.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String showLogin(@RequestParam(value = "login_error", defaultValue = "") String login_error,
			Model model) {
		if (StringUtils.isNotBlank(login_error)) {
			model.addAttribute("error", true);
		}
		return "login";
	}
	
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
		    session.invalidate();
		}
		return "login";
	}
}
