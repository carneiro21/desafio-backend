package br.com.desafio.service;

import java.util.List;

import br.com.desafio.exception.NegocioException;

public interface UsuarioService<T> {

	public void salvar(T t) throws Exception;
	
	public void excluir(T t) throws NegocioException;
	
	public void atualizar(T t) throws NegocioException;
	
	public List<T> buscarTodos() throws NegocioException;
	
	public T getId(long id) throws NegocioException;

}
