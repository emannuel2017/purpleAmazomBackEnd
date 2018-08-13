package wepbr.model;

public class Produto {
	private String marca;
	private String tipo;
	private String codigo;
	private double preco;//150
	private String descricao;
	
   public Produto(String marca,double preco ) {
	this.marca = marca;
	this.preco = preco;
}

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
