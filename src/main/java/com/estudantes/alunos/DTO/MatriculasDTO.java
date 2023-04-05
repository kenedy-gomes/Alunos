package com.estudantes.alunos.DTO;

import java.io.Serializable;

public class MatriculasDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id_matriculas;
	private AlunosDTO alunos;
	private CursosDTO cursos;
	
	public MatriculasDTO() {}

	public MatriculasDTO(String id_matriculas, AlunosDTO alunos, CursosDTO cursos) {
		this.id_matriculas = id_matriculas;
		this.alunos = alunos;
		this.cursos = cursos;
	}

	public String getId_matriculas() {
		return id_matriculas;
	}

	public void setId_matriculas(String id_matriculas) {
		this.id_matriculas = id_matriculas;
	}

	public AlunosDTO getAlunos() {
		return alunos;
	}

	public void setAlunos(AlunosDTO alunos) {
		this.alunos = alunos;
	}

	public CursosDTO getCursos() {
		return cursos;
	}

	public void setCursos(CursosDTO cursos) {
		this.cursos = cursos;
	}

	 
}
