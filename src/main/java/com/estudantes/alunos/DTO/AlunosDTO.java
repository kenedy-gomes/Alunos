package com.estudantes.alunos.DTO;

import com.estudantes.alunos.domain.Alunos;

public class AlunosDTO {

	private String id_alunos;
	private String name;
	private String cpf;
	private String email;
	
	public AlunosDTO() {}

	public AlunosDTO(Alunos obj) {
		id_alunos = obj.getId();
		name = obj.getName();
		cpf = obj.getCpf();
		email = obj.getEmail();
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
	
	
}
