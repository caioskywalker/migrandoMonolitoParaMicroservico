package br.com.cfarias.estrangulamentoMonolito.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class JogoUsuario {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	private Usuario usuario;
	
	@OneToOne
	private Jogo jogo;
	
	public JogoUsuario() {
		
	}
	public JogoUsuario(Jogo jogo, Usuario usuario) {
		this.jogo = jogo;
		this.usuario = usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	
}
