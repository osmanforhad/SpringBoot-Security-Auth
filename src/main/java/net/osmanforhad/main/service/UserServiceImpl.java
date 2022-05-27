package net.osmanforhad.main.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import net.osmanforhad.main.controller.dto.UserRegistrationDto;
import net.osmanforhad.main.model.Role;
import net.osmanforhad.main.model.User;
import net.osmanforhad.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	//inject UserRepository Interface as dependency
	private UserRepository userRepository;

	//all argument constructor
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		//create User model object and pass user input
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLstName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER"))
				);
		return userRepository.save(user);
	}

}
