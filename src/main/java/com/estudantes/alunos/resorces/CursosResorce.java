package com.estudantes.alunos.resorces;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.estudantes.alunos.Repository.CursosRepository;
import com.estudantes.alunos.domain.Cursos;


@RestController
@RequestMapping(value = "/cursos")
public class CursosResorce {

	@Autowired
	CursosRepository service;
	
	@GetMapping
	public ResponseEntity<List<Cursos>> findAll(){
		List<Cursos> obj =  service.findAll();
		return ResponseEntity.ok().body(obj);
	} 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Cursos>> findById(@PathVariable String id){
		Optional<Cursos> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/name")
	public ResponseEntity<List<Cursos>> findByName(@RequestParam String name) {
		List<Cursos> obj = service.findByName(name);
		return ResponseEntity.ok().body(obj);
    }
	@PostMapping
	public ResponseEntity<Cursos> inset(@RequestBody Cursos objDto){
		Cursos obj = service.insert(objDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
	    return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cursos> delete(@PathVariable String id){
		 service.deleteById(id);
		 return ResponseEntity.noContent().build();
	}
	
	
	
}
