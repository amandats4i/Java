package aula_02;

import java.util.Scanner;

public class Exercicio_4 {

//Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre 
//o n1 e n2 pelo produto entre o n3 e o n4.//

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float num1, num2, num3, num4;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextFloat();
		System.out.println("Digite o terceiro numero: ");
		num3 = leia.nextFloat();
		System.out.println("Digite o quarto numero: ");
		num4 = leia.nextFloat();
		
		float diferençaProdutos = (num1 * num2) - (num3 * num4);
		
		System.out.println("A diferença dos produtos é: " + diferençaProdutos);

	}

}
