package ifal.web.com.relatorio;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ifal.web.com.amazom.model.Produto;

public class RelatorioTest {
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemCrescente() {

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
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco(), 0.001);
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco(), 0.001);
				
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemDecrescente() {
		Produto dvd = new Produto("A Galinha Pintadinha V.10", 400.0 );
		Produto tv = new Produto("LG HD", 300.0);
		Produto celular = new Produto("Sansung G0", 250.0);
		
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		double maiorPrecoEsperado = 400.0;
		double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco(), 0.001);
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco(), 0.001);
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemAleatoria() {
		Produto dvd = new Produto("A Galinha Pintadinha V.10", 400.0 );		
		Produto celular = new Produto("Sansung G0", 250.0);
		Produto tv = new Produto("LG HD", 300.0);
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		double maiorPrecoEsperado = 400.0;
		double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco(), 0.001);
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco(), 0.001);
		
		
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemDeUnicoProduto() {

	    Produto celular = new Produto("Sansung G0", 250);
		
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(celular);
	
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		double maiorPrecoEsperado = 250.0;
		double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco(), 0.001);
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco(), 0.001);
		
		
	}
	
}
