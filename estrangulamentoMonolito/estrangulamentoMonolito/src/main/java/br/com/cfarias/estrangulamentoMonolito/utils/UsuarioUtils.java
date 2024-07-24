package br.com.cfarias.estrangulamentoMonolito.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.cfarias.estrangulamentoMonolito.dto.NovoUsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.dto.UsuarioDTO;
import br.com.cfarias.estrangulamentoMonolito.entities.Usuario;

public class UsuarioUtils {

	private UsuarioUtils() {
	};

	public static Usuario fromUsuarioDTO(UsuarioDTO usuarioDTO) {
		return new Usuario(usuarioDTO.getId(), usuarioDTO.getNome(), usuarioDTO.getLogin(), usuarioDTO.getIdade());

	}

	public static UsuarioDTO toUsuarioDTO(Usuario usuario) {
		return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIdade());
	}

	public static Iterable<UsuarioDTO> toUsuarioDTO(Iterable<Usuario> usuarios) {
		List<UsuarioDTO> usuarioDTOList = new ArrayList<>();
		usuarios.forEach(u -> usuarioDTOList.add(new UsuarioDTO(u.getId(), u.getNome(), u.getLogin(), u.getIdade())));
		return usuarioDTOList;
	}

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
