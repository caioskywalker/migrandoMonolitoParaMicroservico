package br.com.cfarias.estrangulamento.novo_servico.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.estrangulamento.novo_servico.entity.Usuario;

public interface RepositoryUsuario extends CrudRepository<Usuario, String> {

}
