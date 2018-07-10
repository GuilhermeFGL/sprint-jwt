package br.com.montreal.api_infraelo.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.montreal.api_infraelo.security.entities.User;
import br.com.montreal.api_infraelo.security.repositories.UserRepository;
import br.com.montreal.api_infraelo.security.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> findByEmail(String email) {
		return Optional.ofNullable(this.userRepository.findByEmail(email));
	}
}
