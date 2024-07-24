package br.com.cfarias.estrangulamentoMonolito.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.entities.Usuario;
import br.com.cfarias.estrangulamentoMonolito.repositories.RepositoryUsuario;
import br.com.cfarias.estrangulamentoMonolito.utils.UsuarioUtils;

@Component
public class ServiceUsuario {

	RepositoryUsuario repositoryUsuario;
	
	public ServiceUsuario(RepositoryUsuario repositoryUsuario) {
		this.repositoryUsuario = repositoryUsuario;
	}
	
	public Iterable<UsuarioDTO> findAllUsers(){
		final Iterable<Usuario> usuarioIterable = repositoryUsuario.findAll();
		return UsuarioUtils.toUsuarioDTO(usuarioIterable);
	}
	
	public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO) {
		Usuario novoUsuario = UsuarioUtils.fromUsuarioDTO(usuarioDTO);
		novoUsuario = repositoryUsuario.save(novoUsuario);
		return UsuarioUtils.toUsuarioDTO(novoUsuario);
		
	}
	
}
