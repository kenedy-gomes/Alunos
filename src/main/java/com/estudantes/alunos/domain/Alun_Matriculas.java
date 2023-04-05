package com.estudantes.alunos.domain;

import java.io.Serializable;
import org.springframework.data.mongodb.core.mapping.Document;
import com.estudantes.alunos.DTO.AlunosDTO;
import com.estudantes.alunos.DTO.CursosDTO;



@Document(collection="alunos_matriculas")
public class Alun_Matriculas implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private AlunosDTO alunos;
	private CursosDTO cursos;
 
	
	public Alun_Matriculas() {}

	public Alun_Matriculas(AlunosDTO alunos, CursosDTO cursos) {
		this.alunos = alunos;
		this.cursos = cursos;
	 

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
