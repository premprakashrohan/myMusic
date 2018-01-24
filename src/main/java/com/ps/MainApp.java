package com.ps;

import javax.persistence.EntityManager;

import com.ps.entity.Song;

public class MainApp {
	public static void main(String[] args) {
	    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	    entityManager.getTransaction().begin();
Song d = new Song("Hello");
entityManager.merge(d);
entityManager.flush();
	    // Check database version
	    String sql = "select count(*) from Song";

	    Object result =   entityManager.createNativeQuery(sql).getSingleResult();
	    System.out.println(result);

	    entityManager.getTransaction().commit();
	    entityManager.close();

	    JPAUtil.shutdown();
	  }
}
