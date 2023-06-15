package com.estudantes.alunos.resorces;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.jsf.el.WebApplicationContextFacesELResolver;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.estudantes.alunos.DTO.LoginResponseDTO;
import com.estudantes.alunos.config.JwtTokenUtil;
import com.estudantes.alunos.domain.Alunos;
import com.estudantes.alunos.services.AlunosService;
 

@CrossOrigin
@RestController
@RequestMapping(value = "/alunos")
public class AlunosResorce {
	
 
	@Autowired
	AlunosService service;
	
	@Autowired
	JwtTokenUtil jwt;

	
	@GetMapping
	public ResponseEntity<List<Alunos>> findAll(){
		List<Alunos> list = service.findAll();
		return ResponseEntity.ok().body(list);
	} 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ResponseEntity<Optional<Alunos>>> findById(@PathVariable String id) {
		ResponseEntity<Optional<Alunos>> list = service.findById(id);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/name")
	public ResponseEntity<List<Alunos>> find(@RequestParam String name) {
		List<Alunos> obj = service.findByName(name);
		return ResponseEntity.ok().body(obj);
	}
	

	@DeleteMapping("/{id}")
 	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity<Object> insert(@RequestBody Alunos objDto) {
		Alunos obj = service.insert(objDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
	@PostMapping(value = "/login")
    public String login(@RequestBody AlunoLoginRequest request) {
        boolean isAuthenticated = service.login(request.getEmail(), request.getPassword());
        
        	if(isAuthenticated) {
        		 String token = jwt.generateToken(Map.of("usuario", request.getEmail()));
        		 return token;
        	} 
        
        	throw new RuntimeException("Usuário ou senha inválidas");
    }
 
 
}

