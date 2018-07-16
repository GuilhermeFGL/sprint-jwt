package br.com.montreal.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.montreal.api.security.entities.RoleEnum;
import br.com.montreal.api.security.entities.User;
import br.com.montreal.api.security.repositories.UserRepository;
import br.com.montreal.api.util.CryptUtil;

@SpringBootApplication
public class ApiInfraeloApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiInfraeloApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			if (userRepository.findByEmail("admin@email.com") == null) {
				User admin = new User();
				admin.setEmail("admin@email.com");
				admin.setRole(RoleEnum.ROLE_ADMIN);
				admin.setPassword(CryptUtil.encrypt("123456"));
				this.userRepository.save(admin);
			}
		};
	}
}
