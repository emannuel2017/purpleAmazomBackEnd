package ifal.web.com.relatorio;

import java.util.ArrayList;
import java.util.List;

import ifal.web.com.amazom.model.Produto;

public class TesteDoRelatorio {

	public static void main(String[] args) {
	
		Produto celular = new Produto("Sansung G0", 250.0);
		Produto tv = new Produto("LG HD", 300.0);
		Produto dvd = new Produto("A Galinha Pintadinha V.10", 400.0 );
				
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		double maiorPrecoEsperado = 400.0;
		double menorPrecoEsperado = 250.0;
		
		
		System.out.println(maiorPrecoEsperado == relatorio.getMaiorPreco());
		
		System.out.println(menorPrecoEsperado == relatorio.getMenorPreco());
		
	}

}
