package br.com.cfarias.estrangulamentoMonolito.dto;

import java.io.Serializable;

public class NovoUsuarioDTO implements Serializable {

	
	private final String id;
	private final String nome;
	private final String login;
	private final Integer idade;
	private Integer alturaCm;
	
	public Integer getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(Integer alturaCm) {
		this.alturaCm = alturaCm;
	}

	public NovoUsuarioDTO(String id, String nome, String login, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.idade = idade;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public Integer getIdade() {
		return idade;
	}
	
	
	

}
