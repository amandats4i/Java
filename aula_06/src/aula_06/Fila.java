package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue <String> fila = new LinkedList <String> ();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		// REMOVE SOMENTE O PRIMEIRO ELEMENTO DA FILA
		fila.remove();
		
		System.out.println(fila);
		
		//MOSTRA O PRIMEIRO ELEMENTO DA FILA
		System.out.println(fila.peek());

		//APRESENTA O PRIMEIRO ELEMENTO DA FILA E O REMOVE
		System.out.println(fila.poll());
		System.out.println(fila);
		
		System.out.println("Maria está na fila?: " + fila.contains("Maria"));
		
		System.out.println("Numero de elementos na fila: " + fila.size());
		System.out.println(fila);
		
		

	}

}
