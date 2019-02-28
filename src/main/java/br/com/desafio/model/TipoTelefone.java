package br.com.desafio.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoTelefone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3051862401887096745L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nomeTipoTelefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeTipoTelefone() {
		return nomeTipoTelefone;
	}

	public void setNomeTipoTelefone(String nomeTipoTelefone) {
		this.nomeTipoTelefone = nomeTipoTelefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nomeTipoTelefone == null) ? 0 : nomeTipoTelefone.hashCode());
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
		TipoTelefone other = (TipoTelefone) obj;
		if (id != other.id)
			return false;
		if (nomeTipoTelefone == null) {
			if (other.nomeTipoTelefone != null)
				return false;
		} else if (!nomeTipoTelefone.equals(other.nomeTipoTelefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoTelefone [id=" + id + ", nomeTipoTelefone=" + nomeTipoTelefone + "]";
	}
}
