package br.com.cfarias.estrangulamentoMonolito.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.estrangulamentoMonolito.entities.Jogo;
import br.com.cfarias.estrangulamentoMonolito.services.ServiceJogo;

@RestController
@RequestMapping(path = "/jogos")
public class ControllerJogo {

	ServiceJogo serviceJogo;
	
	public ControllerJogo(ServiceJogo serviceJogo) {
		this.serviceJogo = serviceJogo;
	}
	
	public Iterable<Jogo> findAllJogos(){
		return serviceJogo.findAllGames();
	}
	
}
