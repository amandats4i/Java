package exercicios_Extra_CLASSES;

import cores.util.Cores;

public class Funcionario {
	
	public static String theme = Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_GREEN_BOLD;
	
	private String nome;
	private int numeroFuncionario;
	private int genero;
	private String cidade;
	private float salario;

	public Funcionario (String nome, int numeroFuncionario, int genero, String cidade, float salario) {
		
		this.nome = nome;
		this.numeroFuncionario = numeroFuncionario;
		this.genero = genero;
		this.cidade = cidade;
		this.salario = salario;
}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setnumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public String getCidade() {
		return cidade;
	}

	public String setCidade(String cidade) {
		return cidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setLocal(float salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		
		String genero = "";

		switch (this.genero) {
		case 1 -> genero = "Feminino";
		case 2 -> genero = "Masculino";
		case 3 -> genero = "Não-Binário";
		}
		
		
		System.out.println(theme + "\n\n★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("         Dados do Funcionário:          ");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero do Funcionário: " + this.numeroFuncionario);
		System.out.println("Genero: " + genero);
		System.out.println("Cidade natal: " + this.cidade);
		System.out.printf("Salário: %.2f \n", this.salario);
		
}
}
