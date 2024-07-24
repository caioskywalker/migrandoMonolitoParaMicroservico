package br.com.cfarias.estrangulamentoMonolito.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.entities.Usuario;
import br.com.cfarias.estrangulamentoMonolito.services.ServiceNovoUsuario;
import br.com.cfarias.estrangulamentoMonolito.services.ServiceUsuario;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
	
	private final ServiceUsuario serviceUsuario;
	private final ServiceNovoUsuario serviceNovoUsuario;
	
	public ControllerUsuario(ServiceUsuario serviceUsuario, ServiceNovoUsuario serviceNovoUsuario) {
		this.serviceUsuario = serviceUsuario;
		this.serviceNovoUsuario = serviceNovoUsuario;
	}
	
	@GetMapping
	public Iterable<UsuarioDTO> findAllUsuarios(){
		return serviceUsuario.findAllUsers();
	}
	
	@PostMapping
	public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		UsuarioDTO novoUsuarioDTOCriado = serviceNovoUsuario.criarNovoUsuario(usuarioDTO);
		serviceUsuario.criarUsuario(usuarioDTO);
		return novoUsuarioDTOCriado;
	}

}
