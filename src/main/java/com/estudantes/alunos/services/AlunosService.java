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
		 String email = obj.getEmail();
	        
	        if (isEmailAlreadyRegistered(email)) {
	            throw new IllegalArgumentException("O email já está cadastrado.");
	        } 
	        
		return repo.insert(obj);
		
	}
	
	 public boolean isEmailAlreadyRegistered(String email) {
	        Alunos existingUser = repo.findByEmail(email);
	        return existingUser != null;
	    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	public void delete(String id) {
		 repo.deleteById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Alunos> findByName(String name) {
		return repo.findByName(name);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
    public boolean login(String email, String password) {
        Alunos user =  repo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
	
}
