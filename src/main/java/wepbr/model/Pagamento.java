package wepbr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Pagamento {
	@Id
	@GeneratedValue
	private Integer id;
	@Enumerated(EnumType.STRING)
	@Column(name="tab_forma")
	private FormaPagamento formaPagamento;	
	@Column
	private Date data;
    
	public Pagamento(Integer id, Date data, FormaPagamento dadoPagamento) {		
		this.id = id;
		this.data = data;
		this.formaPagamento = dadoPagamento;
	}
    
	public Pagamento() {}
	
    public Date getData() {
		return data;
	}
   // escolhe a forma de pagamento do cliente
	public FormaPagamento getDadoPagamento() {
		return formaPagamento;
	}

	public Integer getId() {
		return id;
	}
	
}
