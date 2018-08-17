package wepbr.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Cliente {
	
	@Id
    @GeneratedValue
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@OneToOne
	private CarrinhoDeProduto carrinhoDeProduto;
	
	public Cliente(String nome, Endereco endereco ){
		this.nome = nome;
		this.email = "";
		this.endereco = endereco;
		this.carrinhoDeProduto = new CarrinhoDeProduto();
	}
	public Cliente() {
		super();
	}
		
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	


	public CarrinhoDeProduto getCarrinhoDeProdutos() {
		return carrinhoDeProduto;
	}
	public void setCarrinhoDeProdutos(CarrinhoDeProduto carrinhoDeProduto) {
		this.carrinhoDeProduto = carrinhoDeProduto;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Cliente other = (Cliente) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	


}
