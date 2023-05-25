package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turnini");
		alunos.add("Alberto Souza");
		alunos.add("Karolline Milano");
		alunos.add("Mauro Caetano");
		alunos.add("William Sadoni");
		alunos.add("Ana Luisa");

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		} 
		//Outra maneira de fazer o mesmo:
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		

	}

}
