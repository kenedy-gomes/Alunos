package com.estudantes.alunos.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Cursos")
public class Cursos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;

	public Cursos() {}

	public Cursos(String id, String name ) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cursos other = (Cursos) obj;
		return Objects.equals(id, other.id);
	}
}
