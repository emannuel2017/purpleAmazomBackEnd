package wepbr;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {
  private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
  private static EntityManagerFactory factory;
  
  static {
	  factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
  }

  public static EntityManagerFactory getEntityManagerFactory() {
    if (factory == null) {
      factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    return factory;
  }

  public static void close() {
    if (factory != null) 
      factory.close();
    
  }
  
  public static EntityManager getEntityManager() {
	  return factory.createEntityManager();
	  }
}
