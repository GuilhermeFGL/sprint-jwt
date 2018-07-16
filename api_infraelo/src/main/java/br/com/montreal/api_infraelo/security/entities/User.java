package br.com.montreal.api_infraelo.security.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class User implements Serializable {

	private static final long serialVersionUID = 306411570471828345L;

	private Long id;
	private String email;
	private String password;
	private RoleEnum role;

	public User() { }

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	public RoleEnum getRole() {
		return role;
	}

	public void setRole(RoleEnum perfil) {
		this.role = perfil;
	}

	@Column(name = "senha", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String senha) {
		this.password = senha;
	}

}
