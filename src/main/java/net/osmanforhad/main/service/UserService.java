package net.osmanforhad.main.service;

import net.osmanforhad.main.controller.dto.UserRegistrationDto;
import net.osmanforhad.main.model.User;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);

}
