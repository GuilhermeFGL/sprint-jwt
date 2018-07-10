package br.com.montreal.api_infraelo.security.services;

import java.util.Optional;

import br.com.montreal.api_infraelo.security.entities.User;

public interface UserService {

	/**
	 * Busca e retorna um usuário dado um email.
	 * 
	 * @param email
	 * @return Optional<User>
	 */
	Optional<User> findByEmail(String email);

}
