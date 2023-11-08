package aula_02;

import java.util.Scanner;

public class Exercicio_02 {

	// Elabore um algoritmo em Java que leia 4 notas de um participante, em
	// variáveis do tipo float e exiba na tela a média final do participante.//
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite sua terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("Digite sua quarta nota: ");
		nota4 = leia.nextFloat();
	
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Sua média é: " + media);
		
		
		

	}

}
