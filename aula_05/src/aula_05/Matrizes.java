package aula_05;

import java.util.Scanner;

public class Matrizes {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int matriz [][] = {{1,2,3}, 
						   {4,5,6}, 
						   {7,8,9}};
		
		double [][] matrizDouble = new double [3][3];
		
		
		
		//Nesse caso, matriz.length retorna o tamanho da coluna e da linha
		// indiceI controla as LINHAS
		for (int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			
		
			//indiceC controla as COLUNAS
			for(int indiceC = 0; indiceC < matrizDouble.length; indiceC ++) {
			System.out.println("Matriz[" + indiceI + "][" + indiceC + "] = ");
			matrizDouble[indiceI][indiceC] = leia.nextInt();
			}
			
		}
		//SAIDA DE DADOS
			for (int indiceI = 0; indiceI < matrizDouble.length; indiceI ++) {
			//indiceC controla as COLUNAS
			for(int indiceC = 0; indiceC < matrizDouble.length; indiceC ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceC + "] = " + matrizDouble[indiceI][indiceC]);
				
			}

	} 	for(double[] vetor : matrizDouble) {
		for(double elemento : vetor) {
			System.out.println(elemento);
			
		}
	}

}
}
