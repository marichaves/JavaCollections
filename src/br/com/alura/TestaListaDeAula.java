package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {


		Aula a1 = new Aula("Revisando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		System.out.println(aulas); //Vai mostrar os objetos (representação como string) Precisei criar o método 'To String (Override)' na classe Aula
		
		Collections.sort(aulas); //tem que adicionar o 'implements Comparable<Aulas> a classe, para mostrar que é comparavel
		System.out.println(aulas);// Ordenei alfabeticamente
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));//Vai comparar pelo tempo
		//Também posso fazer essa comparação de tempo da forma:
		//aulas.sort((Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
	}

}
