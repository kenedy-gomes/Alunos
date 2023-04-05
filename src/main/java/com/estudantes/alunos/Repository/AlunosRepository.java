package com.estudantes.alunos.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.estudantes.alunos.domain.Alunos;


public interface AlunosRepository extends MongoRepository<Alunos, String>  {

	@Query("{'name': {$regex: ?0 }})")
	List<Alunos> findByName(String name);

}
