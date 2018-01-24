package com.ps;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.ws.ServiceMode;
@Named
public class JPAUtil implements Serializable {
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	  private static EntityManagerFactory factory;
	   
	 // @Produces
	   // @ApplicationScoped
	    public static EntityManagerFactory getEntityManagerFactory() {
	    if (factory == null) {
	      factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    }
	    return factory;
	  }

	  public static void shutdown() {
	    if (factory != null) {
	      factory.close();
	    }
	  }
}
