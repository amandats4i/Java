package aula_04;

import java.util.Scanner;

public class Exercicio01_FOR {

	// Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
	// primeiro número deve ser menor do que o segundo número. Caso contrário, deve
	// ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
	// do programa.
	// No intervalo informado, mostre na tela todes os números que são múltiplos de
	// 3 e 5. Veja os exemplos abaixo:

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1, numero2;

		// Ler dois numeros digitados pelo user
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();
		
		//onde o primeiro número deve ser menor do que o segundo número.
		if (numero1 > numero2) {
			System.out.println("Intervalo inválido.");	
		
		} else {
			System.out.printf("No Intervalo entre %d e %d: \n", numero1, numero2);
			for (int contador = numero1; contador <= numero2; contador ++) {
				
				if (contador % 3 == 0 && contador % 5 == 0) { 
				System.out.println(contador + " é multiplo de 3 ou 5.");
				 
			}
		}
		

			
			

		}

	}
	
}

