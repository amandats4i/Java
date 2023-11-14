package aula_06;

import java.util.Scanner;

import java.util.ArrayList;

public class Exercicio01_LIST {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		/* O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList*/
		String cor;

		ArrayList<String> cores = new ArrayList<String>();

		for (int contador = 0; contador < 5; contador++) {
			System.out.println("Digite uma cor: ");
			cor = leia.next();

			cores.add(cor);		

		}
		System.out.println("Sua lista de cores é: ");
		System.out.println(cores);
		
		
		System.out.println("\nCores Ordenadas alfabeticamente: ");
		cores.sort(null);
		System.out.println(cores);
	
		
	}
	
		
}
