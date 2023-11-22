package aula_08;

public class Vendedor extends Funcionario implements CalcularSalario {
	
	public float comissao;

	public Vendedor(String nome, int cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
		
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissao: " + this.comissao);
	}

	@Override
	public float calcularSalario() {
		return (this.comissao * this.getSalario() + this.getSalario());
	}

}
