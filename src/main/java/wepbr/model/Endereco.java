package wepbr.model;

public class Endereco {
	private String cidade;
	private String cep;
	private String rua;
	private String numero;
	private String estado;
	private String pais;
	private String numeroTelefone;
	
	public Endereco(String estado, String cep) {
       
		this.cidade = "";
		this.cep = cep;
		this.rua = "";
		this.numero = "";
		this.estado = estado;
		this.pais = "";
		this.numeroTelefone = numeroTelefone;
		
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	
}
