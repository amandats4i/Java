package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03_SET {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Integer numero;

		Set<Integer> numeroInteiro = new HashSet<Integer>();

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();

			numeroInteiro.add(numero);

		} 
		
		ArrayList<Integer> numeroInt = new ArrayList<Integer>(numeroInteiro);
		numeroInt.sort(null);
		System.out.println();
		
		
		
		
		System.out.println("\n");
		Iterator<Integer> iNumeroInteiro = numeroInt.iterator();
		while (iNumeroInteiro.hasNext())
			System.out.println(iNumeroInteiro.next());

	}  	
		
			
			

}

