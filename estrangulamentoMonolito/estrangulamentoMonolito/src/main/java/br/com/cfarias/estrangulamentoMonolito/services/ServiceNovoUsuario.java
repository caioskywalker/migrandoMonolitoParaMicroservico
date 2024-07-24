package br.com.cfarias.estrangulamentoMonolito.services;

import org.springframework.stereotype.Component;

import br.com.cfarias.estrangulamentoMonolito.dto.NovoUsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.feign.ClienteFeignNovoUsuario;
import br.com.cfarias.estrangulamentoMonolito.utils.UsuarioUtils;

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

}
