package wepbr.model;

import java.util.Date;

public class Pagamento {
	private FormaPagamento dadoPagamento;
	private String id;
	private Date data;
    
	public Pagamento(String id, Date data, FormaPagamento dadoPagamento) {		
		this.id = id;
		this.data = data;
		this.dadoPagamento = dadoPagamento;
	}

	public Date getData() {
		return data;
	}
   // escolhe a forma de pagamento do cliente
	public FormaPagamento getDadoPagamento() {
		return dadoPagamento;
	}

	public String getId() {
		return id;
	}
	
}
