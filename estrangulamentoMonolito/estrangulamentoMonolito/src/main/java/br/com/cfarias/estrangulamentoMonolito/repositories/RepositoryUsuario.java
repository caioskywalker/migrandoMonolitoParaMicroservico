package br.com.cfarias.estrangulamentoMonolito.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.estrangulamentoMonolito.entities.Usuario;

public interface RepositoryUsuario extends CrudRepository<Usuario, Long> {

}
