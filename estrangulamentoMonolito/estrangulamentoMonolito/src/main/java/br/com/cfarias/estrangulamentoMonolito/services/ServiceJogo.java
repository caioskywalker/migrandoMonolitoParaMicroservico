package br.com.cfarias.estrangulamentoMonolito.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cfarias.estrangulamentoMonolito.entities.Jogo;
import br.com.cfarias.estrangulamentoMonolito.repositories.RepositoryJogo;

@Component
public class ServiceJogo {

	private RepositoryJogo repositoryJogo;

	public ServiceJogo(RepositoryJogo repositoryJogo) {
		this.repositoryJogo = repositoryJogo;
	}
	
	public Iterable<Jogo> findAllGames(){
		return repositoryJogo.findAll();
	}
	
	
	
	
}
