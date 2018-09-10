package wepbr;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import wepbr.model.Categoria;
import wepbr.model.Cliente;
import wepbr.model.Departamento;
import wepbr.model.Endereco;
import wepbr.model.Produto;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Cliente c = new Cliente();
		Produto a = new Produto();
		Usuario u = new Usuario();
		Endereco e = new Endereco();
		
		e.setCidade("cidadeTeste");
		e.setCep("123Teste");
		
//		u.setNome("Teste user");
//		u.setSenha("Teste senha user");
//		
//		
//		a.setDescricao("produtoTeste");
//		a.setMarca("teste");
//		a.setPreco(1000);
//		
//		c.setNome("testeNome");
//		c.setEmail("emailTeste.com");
		
		
		
		Departamento d = new Departamento("Categoria teste");
		//Categoria c = new Categoria("Categoria teste");
		
		manager.persist(e);		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
