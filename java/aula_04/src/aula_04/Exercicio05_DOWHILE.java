package aula_04;

import java.util.Scanner;

public class Exercicio05_DOWHILE {

	// Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
	// o número zero seja digitado. Ao final, mostre na tela a soma de todos os
	// números digitados, que sejam positivos.

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero, somaPositivos = 0;
		
		
		//Repita até a entrada de 0
		
		do {
			//Ler numeros inteiros
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			//Verificar se é positivo
			if (numero > 0)	
				//Se for positivo, contabiliza
				somaPositivos = somaPositivos + numero;
		
			
		} while (numero != 0);
		
		
		
		
		//Final
		//Mostrar na tela: Soma dos positivos
		System.out.println("Soma dos positivos: " + somaPositivos);

	}

}
