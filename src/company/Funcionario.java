package company;

public class Funcionario {

	private String nome;
	private String cargo;

	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}
	
	public String toString () {
		return nome
				+ " - "
				+cargo;
	}
}
