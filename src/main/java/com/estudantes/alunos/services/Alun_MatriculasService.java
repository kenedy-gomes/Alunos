package com.estudantes.alunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estudantes.alunos.Repository.Alunos_MatriculasRepository;
import com.estudantes.alunos.domain.Alun_Matriculas;


@Service
public class Alun_MatriculasService {

	@Autowired
	Alunos_MatriculasRepository repo;
	
	public List<Alun_Matriculas> findAll() {
		return repo.findAll();
	}
}
