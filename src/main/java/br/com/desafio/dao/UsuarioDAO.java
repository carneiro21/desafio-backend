package br.com.desafio.dao;

import java.util.List;

public interface UsuarioDAO<T> {

	public void salvar(T t);
	
	public void excluir(T t);
	
	public void atualizar(T t);
	
	public List<T> buscarTodos();
	
	public T getId(long id);
}
