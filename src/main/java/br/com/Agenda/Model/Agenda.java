package br.com.Agenda.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="agenda")
public class Agenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ag;
	@Column(nullable = false)
	private String nome;
	private String fone;
	@Column(nullable = false)
	private String email;
	private boolean favoritos;

	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(Long id_ag, String nome, String fone, String email, boolean favoritos) {
		super();
		this.id_ag = id_ag;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.favoritos = favoritos;
	}

	public Long getId_ag() {
		return id_ag;
	}

	public void setId_ag(Long id_ag) {
		this.id_ag = id_ag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFavoritos() {
		return favoritos;
	}

	public void setFavoritos(boolean favoritos) {
		this.favoritos = favoritos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_ag == null) ? 0 : id_ag.hashCode());
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
		Agenda other = (Agenda) obj;
		if (id_ag == null) {
			if (other.id_ag != null)
				return false;
		} else if (!id_ag.equals(other.id_ag))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agenda [id_ag=" + id_ag + ", nome=" + nome + ", fone=" + fone + ", email=" + email + ", favoritos="
				+ favoritos + "]";
	}
	
	
}
