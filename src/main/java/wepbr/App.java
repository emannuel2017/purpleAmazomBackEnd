package wepbr;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import wepbr.model.Cliente;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Cliente c = new Cliente();
		
		c.setNome("Roberto Justos");
		c.setEmail("robertomoney@bb.com");
		
		manager.persist(c);
		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
