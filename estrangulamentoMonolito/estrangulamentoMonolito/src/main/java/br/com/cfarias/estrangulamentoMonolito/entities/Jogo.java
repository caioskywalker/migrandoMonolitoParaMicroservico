package br.com.cfarias.estrangulamentoMonolito.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Jogo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String desenvolvedora;
	
	private String plataforma;
	
	public Jogo() {
		
	}

	public Jogo(Long id, String nome, String desenvolvedora, String plataforma) {
		super();
		this.id = id;
		this.nome = nome;
		this.desenvolvedora = desenvolvedora;
		this.plataforma = plataforma;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	
	
	
	
}
