package br.com.cfarias.estrangulamentoMonolito.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cfarias.estrangulamentoMonolito.dto.NovoUsuarioDTO;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8081")
public interface ClienteFeignNovoUsuario {
	
	@RequestMapping(method = RequestMethod.POST, path = "/usuarios")
	NovoUsuarioDTO criarNovoUsuario(@RequestBody NovoUsuarioDTO novoUsuarioDTO);

}
