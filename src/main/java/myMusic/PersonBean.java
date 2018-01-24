package myMusic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ps.JPAUtil;
import com.ps.entity.Song;

@SessionScoped
@Named("personBean")
public class PersonBean implements Serializable {
	@Inject 
	JPAUtil JPA;
	private static final long serialVersionUID = 1L;
	private String name;
	private List<Song> names = new ArrayList<Song>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
	public void clean() {
		names.clear();
	}

	@PostConstruct
	public void init() {
		name = "Kr-Ishi";
	}

	public List<Song> getNames() {
		return JPA.getEntityManagerFactory().createEntityManager().createQuery(
				"SELECT c FROM Song c")
				.getResultList();
	}

	public void setNames(List<Song> names) {
		this.names = names;
	}
	
	public void saveUSER() {
		EntityManager em = JPA.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = null;
		try {
		    tx = em.getTransaction();
		    tx.begin();
		    em.persist(new Song(name));
		    

		    tx.commit();
		}
		catch (RuntimeException e) {
		    if ( tx != null && tx.isActive() ) tx.rollback();
		    throw e; // or display error message
		}
		finally {
		    em.close();
		}
	}
}