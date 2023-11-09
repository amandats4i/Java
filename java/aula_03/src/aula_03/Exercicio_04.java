package aula_03;

import java.util.Scanner;

public class Exercicio_04 {

// Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), 
	//o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). 
	//A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nome;
		int cargoColaborador;
		float salario;
		
		System.out.println("\nCARGOS E PERCENTURAL DE REAJUSTE: ");
		System.out.println("1 - GERENTE - 10%");
		System.out.println("2 - VENDEDOR - 7%");
		System.out.println("3 - SUPERVISOR - 9%");
		System.out.println("4 - MOTORISTA - 6%");
		System.out.println("5 - ESTOQUISTA - 5%");
		System.out.println("6 - TECNICO TI - 8%");
		
		System.out.print("\nDigite seu nome:");
		nome = leia.next();
		
		System.out.print("\nDigite o código do seu cargo:");
		cargoColaborador = leia.nextInt();
		
		System.out.print("\nDigite seu salário:");
		salario = leia.nextFloat();
		
		switch (cargoColaborador) {
		
		case 1: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.10));
			break;
		case 2: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.07));
			break;
		case 3: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.09));
			break;
		case 4: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.06));
			break;
		case 5: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.05));
			break;
		case 6: 
			System.out.printf("Seu novo salário é: R$ %.2f", salario + (salario * 0.08));
			break;
		}
		

	}
}