package br.com.montreal.api.security.services;

import java.util.Optional;

import br.com.montreal.api.security.entities.User;

public interface UserService {

	Optional<User> findByEmail(String email);
}
