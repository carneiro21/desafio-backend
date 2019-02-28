package br.com.desafio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.desafio.model.Usuario;

public class UsuarioDAOImpl implements  UsuarioDAO<Usuario> {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void salvar(Usuario usuario) {
		 em.persist(usuario);		
	}

	@Override
	public void excluir(Usuario usuario) {
		em.remove(em.getReference(Usuario.class, usuario.getId()));		
	}

	@Override
	public void atualizar(Usuario usuario) {
	    em.merge(usuario);		
	}

	@Override
	public List<Usuario> buscarTodos() {
		return  em.createQuery("select u from Usuario u", Usuario.class)
				 .getResultList();
	}

	@Override
	public Usuario getId(long id) {
		return em.createQuery("select u from Usuario u where u.id = :id", Usuario.class)
                .setParameter("id", id)
                .getSingleResult();
	}

}
