package aula_02;

import java.util.Scanner;

public class Exercicio_03 {

//Elabore um algoritmo em Java, que leia o Salário Bruto, 
//o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, 
//em variáveis do tipo float e exiba na tela o Salário Líquido.//

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		float num1, num2, num3, num4;
		
		System.out.println("Digite seu salário bruto: ");
		num1 = leia.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		num2 = leia.nextFloat();
		System.out.println("Digite suas horas extras: ");
		num3 = leia.nextFloat();
		System.out.println("Digite seus descontos: ");
		num4 = leia.nextFloat();
		
		float salarioLiquido = (num1 + num2 + (num3 * 5) - num4);
		
		System.out.println("Seu salário líquido é: R$" + salarioLiquido);

	}

}
