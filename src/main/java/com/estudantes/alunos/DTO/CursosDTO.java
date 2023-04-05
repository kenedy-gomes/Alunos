package com.estudantes.alunos.DTO;

import com.estudantes.alunos.domain.Cursos;

public class CursosDTO {
	
	private String id_curso;
	private String name_curso;
	
	public CursosDTO() {}

	public CursosDTO(Cursos obj) {
		id_curso = obj.getId();
		name_curso = obj.getName();
	}

	public String getId() {
		return id_curso;
	}

	public void setId(String id) {
		this.id_curso = id;
	}

	public String getName_curso() {
		return name_curso;
	}

	public void setName_curso(String name_curso) {
		this.name_curso = name_curso;
	}
	
	
}
