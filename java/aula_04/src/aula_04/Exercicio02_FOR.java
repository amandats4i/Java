package aula_04;

import java.util.Scanner;

public class Exercicio02_FOR {

	// Escreva um algoritmo em Java, que leia 10 números inteiros
	// via teclado e mostre na tela quantos
	// números são pares e quantos número são ímpares.

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, pares = 0, impares = 0;
		
		 {
			System.out.println("Escolha um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) 
				pares ++;
			
			if (numero % 2 == 1)
				impares ++;
			
		} 
		
			System.out.println("Total de números pares: " + pares);
			System.out.println("Total de números impares: " + impares);
		
					
		
} 

}
