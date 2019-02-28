package br.com.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.exception.NegocioException;
import br.com.desafio.model.Usuario;
import br.com.desafio.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private Response response;
	
	@Autowired
	private UsuarioService<Usuario> usuarioService;
	
	@RequestMapping(value = "/usuario/salvar", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
	@ExceptionHandler(NegocioException.class)
	public Response salvar(Usuario usuario) throws Exception {
		usuarioService.salvar(usuario);		
		this.response.setMsgSucesso("Usuário cadastrado com sucesso.");
		return this.response;
	}

	@RequestMapping(value = "/usuario/excluir", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
	@ExceptionHandler(NegocioException.class)
	public Response excluir(Usuario usuario) throws NegocioException {
		usuarioService.excluir(usuario);
		this.response.setMsgSucesso("Usuário excluido com sucesso.");
		return this.response;
	}

	@RequestMapping(value = "/usuario/atualizar", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
	@ExceptionHandler(NegocioException.class)
	public Response atualizar(Usuario usuario) throws NegocioException {
		usuarioService.atualizar(usuario);	
		this.response.setMsgSucesso("Usuário atualizado com sucesso.");
		return this.response;
	}

	@RequestMapping(value = "/usuario/listar", method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
	@ExceptionHandler(NegocioException.class)
	public List<Usuario> buscarTodos() throws NegocioException {
		return usuarioService.buscarTodos();
	}

	@RequestMapping(value = "/usuario/id/{id}", method = RequestMethod.GET,  produces = "application/json; charset=UTF-8")
	public Usuario getId(@PathVariable long id) throws NegocioException {
		return usuarioService.getId(id);
	}
}
