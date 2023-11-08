package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner (System.in);

	public static void main(String[] args) {
		
	double numero1, numero2;
	
	System.out.println("Digite o primeiro numero: ");
	numero1 = leia.nextDouble();
	System.out.println("Digite o segundo numero: ");
	numero2 = leia.nextDouble();
	
	System.out.println("Soma: " + (numero1 + numero2));
	System.out.println("Subtração: " + (numero1 - numero2));
	System.out.println("Divisão: " + (numero1 / numero2));
	System.out.println("Multipilicação: " + (numero1 * numero2));
	System.out.println("Módulo (resto da divisão): " + (numero1%2));
	
	System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(numero1)));
	System.out.println("Potenciaçao do numero 1 e numero 2: " + (Math.pow(numero1,numero2)));
	}

}
