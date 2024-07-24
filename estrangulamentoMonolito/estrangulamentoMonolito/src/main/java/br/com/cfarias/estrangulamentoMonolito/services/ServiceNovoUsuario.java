package br.com.cfarias.estrangulamentoMonolito.services;

import org.springframework.stereotype.Component;

import br.com.cfarias.estrangulamentoMonolito.dto.NovoUsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.feign.ClienteFeignNovoUsuario;
import br.com.cfarias.estrangulamentoMonolito.utils.UsuarioUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceNovoUsuario {
	
	private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;
	
	public ServiceNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
		this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
	}
	
	public UsuarioDTO criarNovoUsuario(UsuarioDTO usuarioDTO) {
		NovoUsuarioDTO novoUsuarioDTO = UsuarioUtils.toNovoUsuarioDTO(usuarioDTO);
		novoUsuarioDTO = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioDTO);
		return UsuarioUtils.fromNovoUsurioDTO(novoUsuarioDTO);
	}
	
	public Iterable<UsuarioDTO> encontrarTodos(){
		List<NovoUsuarioDTO> novosUsuariosDTO = clienteFeignNovoUsuario.encontrarTodos();
		List<UsuarioDTO> usuariosDTO = new ArrayList<>();
		
		novosUsuariosDTO.forEach(u -> usuariosDTO.add(UsuarioUtils.fromNovoUsurioDTO(u)));
		return  usuariosDTO;
	}

}
