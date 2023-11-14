package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		Set <String> frutas = new HashSet<String>();

		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jabuticaba");
		frutas.add("Kiwi");

		System.out.println(frutas);

		/*
		 * for (var fruta : frutas) System.out.println(fruta.hashCode());
		 */

		System.out.println("A fruta morango existe: " + frutas.contains("Morango"));

		frutas.remove("Morango");

		System.out.println(frutas);

		// ELE TBM PERCORRE UMA LISTA E A EXIBE EM ORDEM 
		Iterator<String> iFrutas = frutas.iterator();
		while (iFrutas.hasNext())
			System.out.println(iFrutas.next());

		// ARRAYLIST CRIADA PARA ORDENAR OS ELEMENTOS
		ArrayList<String> frutasList = new ArrayList<String>(frutas);

		/*
		 * // ADD OS ELEMENTOS A ARRAY voce pode simplesmente colocar a HashSet dentro
		 * do parametro da ArrayList criada ou digitar: frutasList.addAll(frutas);
		 */

		// ORDENAMOS EM ORDEM CRESCENTE
		frutasList.sort(null);
		System.out.println(frutasList);

		// ORDENAMOS EM ORDEM DESCRESCENTE. ".reverseOrder" SÓ FUNCIONA SE A LISTA JA
		// ESTIVER ORDENADA
		frutasList.sort(Comparator.reverseOrder());
		System.out.println(frutasList);

	}

}
