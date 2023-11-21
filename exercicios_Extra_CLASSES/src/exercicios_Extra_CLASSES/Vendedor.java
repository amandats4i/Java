package exercicios_Extra_CLASSES;

public class Vendedor extends Funcionario {

	private String vendedor;

	public Vendedor(String nome, int numeroFuncionario, int genero, String cidade, float salario, String vendedor) {
		super(nome, numeroFuncionario, genero, cidade, salario);
		this.vendedor = vendedor;

	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo: " + this.vendedor);

	}
}
