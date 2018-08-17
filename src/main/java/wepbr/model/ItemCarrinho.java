package wepbr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class ItemCarrinho {
	@Id
	@GeneratedValue
	private Integer  id;
	@Column
	private Double preco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Produto produto;
	@Column
	private Integer quantidade;
	
	public ItemCarrinho(){
		super();
		
		preco = 0.0;
		produto = new Produto();
		quantidade = 0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
