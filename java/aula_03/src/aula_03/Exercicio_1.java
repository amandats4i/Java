package aula_03;

import java.util.Scanner;


public class Exercicio_1 {

	// Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na
	// tela se a soma de A + B é maior, menor ou igual a C. Na construção do Algoritmo, utilize os seguintes conteúdos:
	//- Entrada e Saída de dados
	//- Operadores
	//- Laço Condicional IF

	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		int valorA, valorB, valorC;
		
		System.out.println("Digite o valor de A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		valorC = leia.nextInt();
		
		if (valorA + valorB > valorC){
		
			System.out.println("A soma de A + B é MAIOR  que C");
			
		}else if (valorA + valorB < valorC) {
			System.out.println("A soma de A + B é MENOR que C");
			
		}else if (valorA + valorB == valorC) {
			System.out.println("A soma de A + B é IGUAL a C ");
		}else {
			System.out.println("Inválido");
			
		}
		
		

	}

}
