package company;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private double cnpj;
	private int anoFundacao;
	private ArrayList<Departamento> departamento;
	
	public Empresa(String nome, double cnpj, int anoFundacao) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.anoFundacao = anoFundacao;
		this.departamento = new ArrayList<>();
	}
		
	public String getNome() {
		return nome;
	}

	public void criarDepartamento (Departamento dep) {
		departamento.add(dep);
	}
	
	public Departamento buscarDepartamento(int i) {
		return departamento.get(i);
	}
	
	public String getListaDepartamentos() {
		String dados = "Departamentos: ";
		for (Departamento dep : departamento) {		
			dados += String.format("\n")
					 +"- "+dep.getNome()+" -"
					 +String.format("\n")
					 +"  Lista de Funcionarios: "
					 +dep.getListaFuncionario()
					 +String.format("\n");
		}
		return dados;
	}
	
	public String getDados() {
		return nome
				+", Inscrita no CNPJ: "
				+cnpj
				+", Fundada em: "
				+anoFundacao
				+String.format("\n")
				+getListaDepartamentos();
	}
	
}



