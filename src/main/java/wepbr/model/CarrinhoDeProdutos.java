package wepbr.model;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.OnDelete;

@Entity

public class CarrinhoDeProdutos {
	 
	@Id
	@GeneratedValue
	private Integer id;
	
    @OneToOne
    private Cliente cliente;
	
    @OneToMany
	private List<ItemCarrinho> itensCarrinho;
    
	@OneToOne
	private Pagamento pagamento;
	
	@Column	
	private double subtotal;
	
	
	
	
	public CarrinhoDeProdutos() {
		super();
	}

	public CarrinhoDeProdutos(Integer id ) {
	    this.id = id;
	    cliente = new Cliente();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Pagamento getPagamentos() {
		return pagamento;
	}
	
	public void  iniciaPagamento(String idPagamento, Date data, FormaPagamento formaPagamento) {
		pagamento = new Pagamento(idPagamento,data,formaPagamento);
	}

	public List<ItemCarrinho> getItensCarrinho() {
		return itensCarrinho;
	}

	public void setItensCarrinho(List<ItemCarrinho> itensCarrinho) {
		this.itensCarrinho = itensCarrinho;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	
	
	
	
}
