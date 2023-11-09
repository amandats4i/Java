package aula_03;

import java.util.Scanner;

public class Exercicio_2 {

	// Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre
	// na tela uma mensagem indicando se este número é par ou ímpar e se o número é
	// positivo ou negativo.
	
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero > 0 && numero % 2 == 0) {
			System.out.println("Esse número é PAR e positivo");
		} else if (numero < 0 && numero % 2 >= 1){
			System.out.println("Esse número é ÍMPAR e negativo");
		} else if (numero > 0 && numero % 2 >= 1){
			System.out.println("Esse número é ÍMPAR e positivo");
		} else {
			System.out.println("Esse número é PAR e negativo");
		}
		
		
	}
	
}
	
	


