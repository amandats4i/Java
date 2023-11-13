package aula_05;

import java.util.Scanner;

public class Exercicio04_MATRIZ {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float [][] notas = new float [2][4];
		
		float [] medias = new float [2];
		
		float soma = 0.0f;
		
		for (int indiceI = 0; indiceI < notas.length; indiceI++) {
			
			for (int indiceC = 0; indiceC < notas[indiceI].length; indiceC++) {
				
				System.out.println("Digite a " + (indiceC + 1) + " nota do participante " + (indiceI + 1) + ": ");
				notas[indiceI][indiceC] = leia.nextFloat();
			}
		}
			for (int indiceI = 0; indiceI < notas.length; indiceI++) {
				for (int indiceC = 0; indiceC < notas[indiceI].length; indiceC++) {
					soma += notas[indiceI][indiceC];
				}
				
				medias[indiceI] = soma / notas[indiceI].length;
				soma = 0.0f;
		}
			
			for (int indice = 0; indice < medias.length; indice++) {
				System.out.println("\n Média do participante " + (indice + 1) + ": " + medias [indice]);
			}

}
	
}
