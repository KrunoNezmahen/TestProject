package com.sergio.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginCotroller {
	
	
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		
		//checking username and passowrd
		
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		
		if ("admin".equals(username) && "admin".equals(password)) {
			// if username and passowrd = admin, return dashboard/index.html				
			
			return "redirect:/home";
		}
		
		//if username or password is incorrect
		else return "index";
	}	
		
	
}
