package wepbr;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import wepbr.model.Categoria;
import wepbr.model.Cliente;
import wepbr.model.Departamento;
import wepbr.model.Produto;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		//Cliente c = new Cliente();
		Produto a = new Produto();
		
		/*
		a.setDescricao("emannuel");
		a.setMarca("pedro");
		a.setPreco(250);
		
		c.setNome("Weslley");
		c.setEmail("weslley@bb.com");
		
		*/
		Departamento d = new Departamento("Categoria teste");
		Categoria c = new Categoria("Categoria teste");
		
		manager.persist(c);		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
