package com.estudantes.alunos.DTO;

public class LoginResponseDTO {

	private String token;
	
	public LoginResponseDTO() {}

	public LoginResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
