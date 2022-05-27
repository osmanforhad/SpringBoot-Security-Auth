package net.osmanforhad.main.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.osmanforhad.main.dto.UserRegistrationDto;
import net.osmanforhad.main.model.User;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
