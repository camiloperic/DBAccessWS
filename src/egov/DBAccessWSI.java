package egov;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dbmodel.Citizen;
import dbmodel.Project;

public class DBAccessWSI {

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
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
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
