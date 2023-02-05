package com.greatlearning.cf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.greatlearning.cf.dto.UserRegistrationDto;
import com.greatlearning.cf.model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
