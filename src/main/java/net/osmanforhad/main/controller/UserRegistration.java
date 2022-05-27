package net.osmanforhad.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import net.osmanforhad.main.controller.dto.UserRegistrationDto;
import net.osmanforhad.main.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistration {
	
	//inject UserService Interface as dependency
	private UserService userService;
	
	//all argument constructor
	public UserRegistration(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//method for user registration
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
	

}
