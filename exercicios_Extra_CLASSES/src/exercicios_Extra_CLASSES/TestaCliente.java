package exercicios_Extra_CLASSES;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Vitória Santos", 6952, "São Paulo", "SP", 3);
		c1.visualizar();
		
		Cliente c2 = new Cliente("Rodrigo Rodrigues", 7899, "Curitiba", "PR", 2);
		c2.visualizar();
		
		PessoaFisica c3 = new PessoaFisica ("Marcia Rodrigues", 2261,"Recife", "PE", 1, "1234567770");
		c3.visualizar();
		
		PessoaFisica c4 = new PessoaFisica ("Elton Melo", 1125, "Amparo", "SP", 2, "88822255506");
		c4.visualizar();
		
		PessoaJuridica c5 = new PessoaJuridica ("Arcoverde LTDA.", 3752, "Feira de Santana", "BA", 4, "34252777000110");
		c5.visualizar();

		PessoaJuridica c6 = new PessoaJuridica ("Pelotas Ferragens LTDA.", 9865, "Pelotas", "RS", 4, "2256478900123");
		c6.visualizar();
}
	
}
