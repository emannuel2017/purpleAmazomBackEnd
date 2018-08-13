package wepbr;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Usuario u = new Usuario();
		
		u.setNome("postegres");
		u.setSenha("wep");
		
		manager.persist(u);
		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
