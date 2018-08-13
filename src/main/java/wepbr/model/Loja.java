package wepbr.model;
import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String registro;
	private List <Departamento> departamentos;
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
