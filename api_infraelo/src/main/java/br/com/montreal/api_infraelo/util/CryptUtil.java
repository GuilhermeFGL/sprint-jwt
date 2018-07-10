package br.com.montreal.api_infraelo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CryptUtil {
	
	public static String encrypt(String value) {
		if (value == null) {
			return null;
		}
		
		return new BCryptPasswordEncoder().encode(value);
	}
	
	public static boolean compare(String value, String encryptedValue) {
		return new BCryptPasswordEncoder().matches(value,  encryptedValue);
	}

}
