package net.osmanforhad.main.controller.dto;

public class UserRegistrationDto {
	
	private String firstName;
	private String lstName;
	private String email;
	private String password;
	
	//no argument constructor
	public UserRegistrationDto() {
		super();
		
	}

	//all argument constructor
	public UserRegistrationDto(String firstName, String lstName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lstName = lstName;
		this.email = email;
		this.password = password;
	}

	//getter and setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLstName() {
		return lstName;
	}

	public void setLstName(String lstName) {
		this.lstName = lstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
