package br.com.sparkcursos.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author Murillo França,
 * @version 0.1
 */

public class Cursos {
	private String nomeDoCurso;
	private String instrutor;
	// private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new LinkedHashSet<>();

	public void adicionaAlunos(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public Cursos(String nomeDoCurso, String instrutor) {
		this.nomeDoCurso = nomeDoCurso;
		this.instrutor = instrutor;
	}

}
