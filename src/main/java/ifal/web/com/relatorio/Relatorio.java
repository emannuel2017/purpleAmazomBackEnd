package ifal.web.com.relatorio;

import java.util.List;

import ifal.web.com.amazom.model.Produto;

public class Relatorio {

	private double maiorPreco = Double.NEGATIVE_INFINITY;
	private double menorPreco = Double.POSITIVE_INFINITY;
	
	public void gerarRelatorioDePreco(List<Produto> produtos) {
		for (Produto produto : produtos) {
			if(produto.getPreco() > maiorPreco) {
				maiorPreco = produto.getPreco();
			}if(produto.getPreco() < menorPreco) {
				menorPreco = produto.getPreco();
			}
		}		
	}

	public double getMaiorPreco() {
		return maiorPreco;
	}

	public double getMenorPreco() {
		return menorPreco;
	}
		
}
