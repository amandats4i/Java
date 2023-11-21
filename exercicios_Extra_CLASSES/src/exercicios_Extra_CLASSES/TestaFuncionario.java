package exercicios_Extra_CLASSES;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario c1 = new Funcionario ("Vitória Santos", 6952, 3, "Jundiaí", 3000.00f);
		c1.visualizar();

		Gerente c2 = new Gerente ("Lourdes Kesen", 6355, 1, "Porto Velho", 6520.00f, "Gerente");
		c2.visualizar();
		
		Gerente c3 = new Gerente ("Lucas Ramos", 2296, 2, "Campinas", 5500.00f, "Gerente");
		c3.visualizar();
		
		Vendedor c4 = new Vendedor ("Patrick Jins", 3892, 2, "São Paulo", 2895.00f, "Vendedor");
		c4.visualizar();
		
		Vendedor c5 = new Vendedor ("Kristina Pinho", 7894, 1, "Pindamonhangaba", 2895.00f, "Vendedora");
		c5.visualizar();
		
		
	}

}
