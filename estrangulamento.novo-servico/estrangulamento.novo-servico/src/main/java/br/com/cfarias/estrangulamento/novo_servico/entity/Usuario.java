package br.com.cfarias.estrangulamento.novo_servico.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Usuario {

	@Id
	private String id;
	
	private String nome;
	
	private String login;
	
	private String idade;
	
	private Integer alturaCm;
	

	public Usuario() {};

	public Usuario(String id,String nome, String login, String idade, Integer alturaCm) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.idade = idade;
		this.alturaCm = alturaCm;
	}
	
	@PrePersist
	public void criaId() {
		this.id = UUID.randomUUID().toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Integer getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(Integer alturaCm) {
		this.alturaCm = alturaCm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
