package br.com.cfarias.estrangulamentoMonolito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.services.ServiceNovoUsuario;


@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
	
	
	private final ServiceNovoUsuario serviceNovoUsuario;
	
	public ControllerUsuario(ServiceNovoUsuario serviceNovoUsuario) {
		
		this.serviceNovoUsuario = serviceNovoUsuario;
	}
	
	@GetMapping
	public Iterable<UsuarioDTO> findAllUsuarios(){
		return serviceNovoUsuario.encontrarTodos();
	}
	
	@PostMapping
	public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		return serviceNovoUsuario.criarNovoUsuario(usuarioDTO);
	}

}
