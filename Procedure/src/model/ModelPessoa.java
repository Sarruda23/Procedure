package model;

public class ModelPessoa 
{
	private String cpf;
	private String nome;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ModelPessoa(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}	
}
