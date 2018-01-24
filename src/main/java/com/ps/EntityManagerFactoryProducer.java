package com.ps;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Named
public class EntityManagerFactoryProducer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	  
	@Produces
    @ApplicationScoped
    public EntityManagerFactory create() {
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public void destroy(@Disposes EntityManagerFactory factory) {
        factory.close();
    }

}