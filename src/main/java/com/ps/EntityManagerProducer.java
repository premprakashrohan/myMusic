package com.ps;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
public class EntityManagerProducer implements Serializable{
	private static final long serialVersionUID = -878151269129404728L;
	@Inject
    transient EntityManagerFactory emf;

    @Produces
    @RequestScoped
    public EntityManager create() {
        return emf.createEntityManager();
    }

    public void destroy(@Disposes EntityManager em) {
        em.close();
    }
}