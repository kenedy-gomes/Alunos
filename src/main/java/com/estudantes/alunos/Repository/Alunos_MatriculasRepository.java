package com.estudantes.alunos.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estudantes.alunos.domain.Alun_Matriculas;

public interface Alunos_MatriculasRepository extends MongoRepository<Alun_Matriculas, String>  {

}
