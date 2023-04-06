package com.estudantes.alunos.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.estudantes.alunos.DTO.AlunosDTO;
import com.estudantes.alunos.DTO.CursosDTO;
import com.estudantes.alunos.Repository.AlunosRepository;
import com.estudantes.alunos.Repository.Alunos_MatriculasRepository;
import com.estudantes.alunos.Repository.CursosRepository;
import com.estudantes.alunos.domain.Alun_Matriculas;
import com.estudantes.alunos.domain.Alunos;
import com.estudantes.alunos.domain.Cursos;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private AlunosRepository alunosRepository;

	@Autowired
	private CursosRepository cursosRepository;

	@Autowired
	private Alunos_MatriculasRepository AlunosRepository;

	@Override
	public void run(String... args) throws Exception {
		alunosRepository.deleteAll();
		cursosRepository.deleteAll();
		AlunosRepository.deleteAll();

		Cursos c1 = new Cursos(null, "Analise e desenvolvimento de sistemas");
		Cursos c2 = new Cursos(null, "Engenharia Civil");
		Cursos c3 = new Cursos(null, "Arquitetura");
		cursosRepository.saveAll(Arrays.asList(c1, c2, c3));

		Alunos kenedy = new Alunos(null, "Kenedy Gomes Camargo", "70005483123", "kndgfls5@gmail.com");
		Alunos Gerson = new Alunos(null, "Gerson ferreira", "52828382332", "Gersonferreira@gmail.com");
		Alunos Alano = new Alunos(null, "Isabella ribeiro", "70005483123", "Isabella@gmail.com");
		alunosRepository.saveAll(Arrays.asList(kenedy, Gerson, Alano));

		Alun_Matriculas m1 = new Alun_Matriculas(new AlunosDTO(kenedy), new CursosDTO(c1));
		AlunosRepository.saveAll(Arrays.asList(m1));

		Alun_Matriculas m2 = new Alun_Matriculas(new AlunosDTO(Gerson), new CursosDTO(c2));
		AlunosRepository.saveAll(Arrays.asList(m2));

		Alun_Matriculas m3 = new Alun_Matriculas(new AlunosDTO(Alano), new CursosDTO(c3));
		AlunosRepository.saveAll(Arrays.asList(m3));

	}
	 

}
