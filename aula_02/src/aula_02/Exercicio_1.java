package aula_02;

import java.util.Scanner;

public class Exercicio_1 {
	
	//Desenvolva um algoritmo que solicite um valor do Salario, leia esse valor.//
	//Depois, que solicite o valor do Abono, leia esse abono.//
	//Depois, que some o Salario + Abono e o retorne como NovoSalário, e o exibe.//
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
		float numero1, numero2;
		
		System.out.println("Digite o valor do seu salário atual: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o valor do seu abono salarial: ");
		numero2 = leia.nextFloat();
		
		float NovoSalario = numero1 + numero2;
		
		System.out.println("Seu novo salário é: R$" + NovoSalario);
		
		

	}

}
