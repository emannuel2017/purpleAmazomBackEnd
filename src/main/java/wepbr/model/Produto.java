package wepbr.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String marca;
	@Column
	private String tipo;
	@Column
	private String codigo;
	@Column
	private double preco;//150
	@Column
	private String descricao;
	
   public Produto(String marca,double preco ) {
	this.marca = marca;
	this.preco = preco;
}
   
   
   
   public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public void setMarca(String marca) {
	this.marca = marca;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
}



public Produto() {}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getMarca() {
	return marca;
}

public String getTipo() {
	return tipo;
}

public String getCodigo() {
	return codigo;
}
   
   
   
   
}
