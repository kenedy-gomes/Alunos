package com.estudantes.alunos.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.estudantes.alunos.Repository.CursosRepository;
import com.estudantes.alunos.domain.Cursos;

@Service
public class CursosService {

	@Autowired
	CursosRepository repo;
	
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Cursos> findAll() {
		return repo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Optional<Cursos>> findById(String id){
		Optional<Cursos> obj = repo.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Cursos> findByName(String name) {
		return repo.findByName(name);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public Cursos inset(Cursos obj){
		return repo.insert(obj);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	public void delete(String obj) {
		repo.deleteById(obj);
	}
	
		
}
