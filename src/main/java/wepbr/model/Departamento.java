package wepbr.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Departamento {
	@GeneratedValue
	
	private String nome;
	private List <Categoria> categorias;
	
	
	public Departamento(String nome) {
		this.nome = nome;
		categorias = new ArrayList <Categoria>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Categoria> getCategorias() {
		return categorias;
	}


	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
}
