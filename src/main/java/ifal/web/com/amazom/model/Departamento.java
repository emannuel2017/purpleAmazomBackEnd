package ifal.web.com.amazom.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List <Categoria> categorias;
	
	
	public Departamento(String nome) {
		this.nome = nome;
		categorias = new ArrayList <Categoria>();
	}
	public Departamento() {}


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
