package company;

import java.util.ArrayList;

public class Departamento {

	private String nome;
	private ArrayList<Funcionario> funcionario;

	public Departamento(String nome) {
		this.nome = nome;
		this.funcionario = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	} 
	
	public void incluirFuncionario(Funcionario func) {
		funcionario.add(func);
	}
	
	public String getListaFuncionario() {
		return funcionario.toString();
	}
	
}
