package com.faculdade.controleestagio.models;

public class Usuarios {

	private Integer codigo;

	private String nome;

	private Integer idade;

	private String email;

	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

	public Usuarios(String nome, Integer idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuarios [codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
	}

}
