package exercicios_Extra_CLASSES;



public class Funcionario {
	
	private String nome;
	private int numeroFuncionario;
	private int genero;
	private String cargo;
	private float salario;

	public Funcionario (String nome, int numeroFuncionario, int genero, String cargo, float salario) {
		
		this.nome = nome;
		this.numeroFuncionario = numeroFuncionario;
		this.genero = genero;
		this.cargo = cargo;
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

	public String getCargo() {
		return cargo;
	}

	public String setCargo(String cargo) {
		return cargo;
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
		
		
		System.out.println("\n\n★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("         Dados do Funcionário:          ");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero do Funcionário: " + this.numeroFuncionario);
		System.out.println("Genero: " + genero);
		System.out.println("Cargo: " + this.cargo);
		System.out.printf("Salário: %.2f ", this.salario);
		

}
}
