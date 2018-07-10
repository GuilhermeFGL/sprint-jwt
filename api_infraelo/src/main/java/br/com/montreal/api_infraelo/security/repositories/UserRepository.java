package br.com.montreal.api_infraelo.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.montreal.api_infraelo.security.entities.User;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
