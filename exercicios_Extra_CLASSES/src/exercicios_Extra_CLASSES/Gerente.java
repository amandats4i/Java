package exercicios_Extra_CLASSES;

public class Gerente extends Funcionario {

	private String gerente;

	public Gerente(String nome, int numeroFuncionario, int genero, String cidade, float salario, String gerente) {
		super(nome, numeroFuncionario, genero, cidade, salario);
		this.gerente = gerente;

	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo: " + this.gerente);

	}
}
