package br.com.sparkcursos.modelo;

import java.util.Collection;
import java.util.HashSet;

/**
 * 
 * @author Murillo França,
 * @version 0.1
 *
 */

public class Aluno {
	private String nome;
	private int NumeroDaMatricula;
	Collection<String> alunos = new HashSet<>();
	
	public Aluno(String nome, int numeroDaMatricula ) {
		if(nome == null || numeroDaMatricula == 0) {
			throw new NullPointerException("Não pode ser null.");
		}
		this.nome = nome;
		this.NumeroDaMatricula = numeroDaMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.NumeroDaMatricula;
	}

	public void setMatricula(int matricula) {
		this.NumeroDaMatricula = matricula;
	}
	
	
	@Override
		public String toString() {
			
			return "Aluno:" + this.nome + ", matrícula: " + this.NumeroDaMatricula + ".";
		}
	

}
