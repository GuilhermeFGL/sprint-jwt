package br.com.montreal.api_infraelo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.montreal.api_infraelo.security.entities.RoleEnum;
import br.com.montreal.api_infraelo.security.entities.User;

public class JwtUserFactory {

	private JwtUserFactory() { }

	/**
	 * Converte e gera um JwtUser com base nos dados de um funcionário.
	 * 
	 * @param user
	 * @return JwtUser
	 */
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(),
				mapToGrantedAuthorities(user.getRole()));
	}

	/**
	 * Converte o perfil do usuário para o formato utilizado pelo Spring Security.
	 * 
	 * @param roleEnum
	 * @return List<GrantedAuthority>
	 */
	private static List<GrantedAuthority> mapToGrantedAuthorities(RoleEnum roleEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(roleEnum.toString()));
		return authorities;
	}

}
