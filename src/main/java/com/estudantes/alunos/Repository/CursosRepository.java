package com.estudantes.alunos.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

 
import com.estudantes.alunos.domain.Cursos;

public interface CursosRepository extends MongoRepository<Cursos, String> {

	@Query("{'name': {$regex: ?0 }})")
	List<Cursos> findByName(String name);

}
