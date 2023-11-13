package aula_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
     int numero1 = 10, numero2 = 20;
     String valor1 = "2", valor2 = "3";
     
     float media = 2.65645f; 
     
     int tamanho;
     
     System.out.println("A soma das variáveis número 1 e número 2 é igual a: " + (numero1 + numero2));
     System.out.println("A soma das variáveis valor 1 e valor 2 é igual a: " + (valor1 + valor2));
     
     System.out.printf("A média final é %.2f", media);
     
     System.out.println("\nDigite o tamanho: ");
     tamanho = leia.nextInt();
     
     System.out.println("O valor digitado foi: " + tamanho);
     
	}

}
