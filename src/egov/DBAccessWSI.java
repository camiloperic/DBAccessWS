package egov;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Following;
import model.Signature;
import dbmodel.Argument;
import dbmodel.Citizen;
import dbmodel.Comment;
import dbmodel.Project;

public class DBAccessWSI {

	//SAVE METHODS
	
	public boolean saveCitizen (Citizen citizen) {
		if(citizen.getId() != null) citizen.setId(null);
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(citizen);
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveProject (Project project) {
		if(project.getId() != null) project.setId(null);
		if(project.getIdParent() == -1) project.setIdParent(null);
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(project);
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveArgument (Argument argument) {
		if(argument.getId() != null) argument.setId(null);
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(argument);
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveComment (Comment comment) {
		if(comment.getId() != null) comment.setId(null);
		if(comment.getIdParent() != null && comment.getIdParent() == -1) comment.setIdParent(null);
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(comment);
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveSignature (Signature signature) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(signature.getDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveFollowing (Following following) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(following.getDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//GET METHODS
	
	public boolean isSketch (int idProject) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
		EntityManager em = emf.createEntityManager();
		boolean result = (boolean) em.createNativeQuery("select sketch from project where id=:idProject").setParameter("idProject", idProject).getSingleResult();
		em.close();
		return result;
	}
	
	//REFERENCE
	
	public boolean test () {
		Citizen citizen = new Citizen();
		citizen.setCpf("36446575142");
		citizen.setEmail("cidadao9@egov.br");
		citizen.setName("Cidadao da Silva 9");
		citizen.setPasswd("passwd");
		citizen.setUsername("cidadaosilva9");
		citizen.setId(45);
		citizen.setId(null);
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			//em.remove(citizen);
			//List<Citizen> citizens = em.createQuery("select c from Citizen c").getResultList();
			tx = em.getTransaction();
			tx.begin();
			em.persist(citizen);
			//em.createNativeQuery("insert into Citizen(id,name) values(?,?)").setParameter(1,1).setParameter(2,"Name").executeUpdate();
			//em.flush();
			tx.commit();
			System.out.println("ID: " + citizen.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
