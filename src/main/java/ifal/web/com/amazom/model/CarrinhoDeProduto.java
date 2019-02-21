
package ifal.web.com.amazom.model;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity

public class CarrinhoDeProduto {
	 
	@Id
	@GeneratedValue
	private Integer id;
	
	
    @OneToMany(cascade = CascadeType.ALL)
	private List<ItemCarrinho> itensCarrinho;
    
	@OneToOne(cascade = CascadeType.ALL)
	private Pagamento pagamento;
	
	@Column	
	private double subtotal;
	
	
	
	
	public CarrinhoDeProduto() {
		super();
	}

	public CarrinhoDeProduto(Integer id ) {
	    this.id = id;
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
	
	public void  iniciaPagamento(Integer idPagamento, Date data, FormaPagamento formaPagamento) {
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
