package teste;

import java.util.Scanner;

public class teste2 {
	
	static  Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        String nome; 
        int contador = 0;
     
        while (contador < 3) {
        	
        	contador++;
        	System.out.println("\nDigite o " + contador + "º nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + "º nome é: " + nome);
        }
    }
}