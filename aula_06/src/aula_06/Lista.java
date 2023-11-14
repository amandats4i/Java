package aula_06;

import java.util.Scanner;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();

		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);

		
		// FOR EACH
		for (Double nota : notas)
			System.out.println(nota);
		
		System.out.println("\n");
		
		// ESSE É UM FOR EACH SIMPLIFICADO
				notas.forEach(System.out::println);

		/* for (var nota : notas)
		// System.out.println(nota); 
		
		---> podemos usar o VAR para substituir um tipo de
		variavel, mas ele precisa conseguir ler essa variavel, ou seja, ela tem que
		estar em uso. Ele é um facilitador caso vc precise saber o tipo da
		variável. Então se lá em cima você definir uma variavel Double mas precisar
		mudar para Float, ele reconhece essa mudança. */
		
		System.out.println(notas);

		System.out.println("Posiçao do elemento 7: " + notas.indexOf(7.0));

		System.out.println("Existe elemento 7: " + notas.get(0));
		
		// REMOVE APENAS O NUMERO DO INDICE INDICADO
		notas.remove(3);
		System.out.println(notas);
	
		
		// REMOVE TODOS OS ELEMENTOS DA LISTA
		notas.clear();
		System.out.println("A lista esta vazia? " + notas.isEmpty());
		
		
		
		
		
		
		
	}

}
