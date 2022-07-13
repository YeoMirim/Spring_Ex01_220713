package com.mirim.test01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/loginPass")
	public String studentRedirect(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if (id.equals("tiger") && pw.equals("12345")) {

			model.addAttribute("id", id);
			return "loginOk"; 
			
		}
		
		model.addAttribute("id", id);
		return "loginFail";
	}
	
	
	@RequestMapping("/loginOk")
	public String loginOk() {
		
		return "loginOk";
	}
	
	@RequestMapping("/loginFail")
	public String loginFail() {
		
		return "loginFail";
	}
	
}
