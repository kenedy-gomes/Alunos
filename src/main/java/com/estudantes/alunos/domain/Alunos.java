package com.estudantes.alunos.domain;

import java.io.Serializable;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Alunos")
public class Alunos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id_alunos;
	private String name;
	private String cpf;
	private String email;
	private String password;

	public Alunos() {}

	public Alunos(String id, String name, String cpf, String email, String password) {
		super();
		this.id_alunos = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		
	}

	public String getId() {
		return id_alunos;
	}

	public void setId(String id) {
		this.id_alunos = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_alunos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return Objects.equals(id_alunos, other.id_alunos);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
