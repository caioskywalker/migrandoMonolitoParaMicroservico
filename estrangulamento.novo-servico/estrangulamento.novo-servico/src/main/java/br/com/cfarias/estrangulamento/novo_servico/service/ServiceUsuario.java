package br.com.cfarias.estrangulamento.novo_servico.service;


import org.springframework.stereotype.Component;

import br.com.cfarias.estrangulamento.novo_servico.entity.Usuario;
import br.com.cfarias.estrangulamento.novo_servico.repository.RepositoryUsuario;

@Component
public class ServiceUsuario {

	
	private RepositoryUsuario repositoryUsuario;
	
	public ServiceUsuario(RepositoryUsuario repositoryUsuario) {
		this.repositoryUsuario = repositoryUsuario;
	}
	
	
	public Iterable<Usuario> encontrarTodos(){
		return repositoryUsuario.findAll();
	}
	
	public Usuario criarUsuario(Usuario usuario) {
		return repositoryUsuario.save(usuario);
	}
}
