package br.com.cfarias.estrangulamentoMonolito.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.cfarias.estrangulamentoMonolito.dto.NovoUsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.entities.Usuario;

public class UsuarioUtils {

	private UsuarioUtils() {
	};



	public static UsuarioDTO fromNovoUsurioDTO(NovoUsuarioDTO novoUsuarioDTO) {
		UsuarioDTO usuarioDTO = new UsuarioDTO(null, novoUsuarioDTO.getNome(), novoUsuarioDTO.getLogin(),
				novoUsuarioDTO.getIdade());
		usuarioDTO.setIdNovoUsuario(novoUsuarioDTO.getId());
		usuarioDTO.setAlturaCm(novoUsuarioDTO.getAlturaCm());
		return usuarioDTO;
	}

	public static NovoUsuarioDTO toNovoUsuarioDTO(UsuarioDTO usuarioDTO) {
		NovoUsuarioDTO novoUsuarioDTO = new NovoUsuarioDTO(null, usuarioDTO.getNome(), usuarioDTO.getLogin(),
				usuarioDTO.getIdade());
		novoUsuarioDTO.setAlturaCm(usuarioDTO.getAlturaCm());

		return novoUsuarioDTO;

	}
}
