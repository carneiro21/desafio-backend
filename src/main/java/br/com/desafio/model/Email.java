package br.com.desafio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Email implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7805229843757190674L;
	
 	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
 	
	@Column(nullable = false)
	private String emailCadastro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USUARIO_ID", nullable = false)
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailCadastro() {
		return emailCadastro;
	}

	public void setEmailCadastro(String emailCadastro) {
		this.emailCadastro = emailCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailCadastro == null) ? 0 : emailCadastro.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (emailCadastro == null) {
			if (other.emailCadastro != null)
				return false;
		} else if (!emailCadastro.equals(other.emailCadastro))
			return false;
		if (id != other.id)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", emailCadastro=" + emailCadastro + ", usuario=" + usuario + "]";
	}
	
}
