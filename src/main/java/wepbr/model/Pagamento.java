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
	private String id;
	@Enumerated(EnumType.STRING)
	@Column(name="tab_forma")
	private FormaPagamento formaPagamento;	
	@Column
	private Date data;
    
	public Pagamento(String id, Date data, FormaPagamento dadoPagamento) {		
		this.id = id;
		this.data = data;
		this.formaPagamento = dadoPagamento;
	}

	public Date getData() {
		return data;
	}
   // escolhe a forma de pagamento do cliente
	public FormaPagamento getDadoPagamento() {
		return formaPagamento;
	}

	public String getId() {
		return id;
	}
	
}
