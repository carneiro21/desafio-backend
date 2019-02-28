package br.com.desafio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.dao.UsuarioDAO;
import br.com.desafio.exception.NegocioException;
import br.com.desafio.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService<Usuario> {
	
	@Autowired
	private UsuarioDAO<Usuario> usuarioDAO;

	@Override
	public void salvar(Usuario usuario) throws Exception {
		usuarioDAO.salvar(usuario);		
	}

	@Override
	public void excluir(Usuario usuario) throws NegocioException {
		usuarioDAO.excluir(usuario);
	}

	@Override
	public void atualizar(Usuario usuario) throws NegocioException {
		usuarioDAO.atualizar(usuario);		
	}

	@Override
	public List<Usuario> buscarTodos() throws NegocioException {
		return usuarioDAO.buscarTodos();
	}

	@Override
	public Usuario getId(long id) throws NegocioException {
		return usuarioDAO.getId(id);
	}

}
