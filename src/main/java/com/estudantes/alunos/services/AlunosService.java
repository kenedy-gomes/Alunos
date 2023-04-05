package com.estudantes.alunos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.estudantes.alunos.Repository.AlunosRepository;
import com.estudantes.alunos.domain.Alunos;

@Service
public class AlunosService {

	@Autowired
	AlunosRepository repo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Alunos> findAll() {
		return repo.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Optional<Alunos>> findById(String id){
		Optional<Alunos> obj = repo.findById(id);
		return  ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public Alunos insert(Alunos obj) {
		return repo.insert(obj);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public void delete(String id) {
		 repo.deleteById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Alunos> findByName(String name) {
		return repo.findByName(name);
	}
	
}
