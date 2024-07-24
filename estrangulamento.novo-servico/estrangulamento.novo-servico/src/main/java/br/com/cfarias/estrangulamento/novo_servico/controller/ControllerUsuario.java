package br.com.cfarias.estrangulamento.novo_servico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.estrangulamento.novo_servico.entity.Usuario;
import br.com.cfarias.estrangulamento.novo_servico.service.ServiceUsuario;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
	
	
	private ServiceUsuario serviceUsuario;
	
	public ControllerUsuario(ServiceUsuario serviceUsuario) {
		this.serviceUsuario = serviceUsuario;
	}
	
	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		return serviceUsuario.criarUsuario(usuario);
	}
	
	@GetMapping
	public Iterable<Usuario> encontrarTodosUsuarios(){
		return serviceUsuario.encontrarTodos();
	}
	
	

}
