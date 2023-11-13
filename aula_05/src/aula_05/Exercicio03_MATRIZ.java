package aula_05;

import java.util.Scanner;

public class Exercicio03_MATRIZ {


	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
			
			
			int [] [] matriz = new int [3][3];
			
			int somaDiagonalPrincipal = 0,somaDiagonalSec = 0;
			
			String diagonalP = " ", diagonalS = " ";
			
			
			for(int indiceI = 0; indiceI < matriz.length; indiceI++) {
				for(int indiceC = 0; indiceC < matriz.length; indiceC++ ) {
				System.out.println("Digite o numero da posiçao: " + indiceI + "," + indiceC + ": ");	
					matriz[indiceI][indiceC] = leia.nextInt();
			}
				
			}
			
			for (int indice = 0; indice < matriz.length; indice ++) {
				diagonalP += matriz[indice][indice] + " ";
				somaDiagonalPrincipal += matriz[indice][indice];
			}
			
			for (int indice = 0; indice < matriz.length; indice ++) {
				diagonalS += matriz[indice][matriz.length - 1 - indice] + " ";
				somaDiagonalSec += matriz[indice][matriz.length - 1 - indice];
			}	
			System.out.println("Elementos da Diagonal Principal: " + diagonalP);
			System.out.println("Soma diagonal Principal " + somaDiagonalPrincipal);
			
			System.out.println("Elementos da Diagonal Principal: " + diagonalS);
			System.out.println("Soma diagonal Secundaria " + somaDiagonalSec);
			
		

	

}
}

