package wepbr.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Loja {
	@Id
	private String registro;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List <Departamento> departamentos;
	
	@Column
	private String email;
	
    public Loja(String registro) {
    	this.registro = registro;
    	this.email = "";
		departamentos = new ArrayList<Departamento>();
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistro() {
		return registro;
	}
    
    
}
