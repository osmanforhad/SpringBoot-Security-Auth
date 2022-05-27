package net.osmanforhad.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.osmanforhad.main.dto.UserRegistrationDto;
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
	
	//create empty user object to store form data
	@ModelAttribute("user")
	public UserRegistrationDto  userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	//method for view registration page
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	//method for user registration
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
	

}
