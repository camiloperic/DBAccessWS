package br.sinples.wsi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.commons.httpclient.Header;

import br.sinples.dbmodel.Argument;
import br.sinples.dbmodel.Citizen;
import br.sinples.dbmodel.Comment;
import br.sinples.dbmodel.Keyword;
import br.sinples.dbmodel.Project;
import br.sinples.model.AgreeArgument;
import br.sinples.model.AgreeComment;
import br.sinples.model.Following;
import br.sinples.model.Keyworded;
import br.sinples.model.Signature;
import br.sinples.model.Tagged;
import br.sinples.model.view.ArgumentView;
import br.sinples.model.view.ProjectView;

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
			em.persist(signature.toDBModel());
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
			em.persist(following.toDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveTagged (Tagged tagged) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(tagged.toDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveKeyworded (Keyworded keyworded) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(keyworded.toDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveAgreeArgument (AgreeArgument agreeArgument) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(agreeArgument.toDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveAgreeComment (AgreeComment agreeComment) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(agreeComment.toDBModel());
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean saveKeyword (Keyword keyword) {
		if (keyword.getId() != null) keyword.setId(null);
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			em.persist(keyword);
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	//GET METHODS
	
	public ProjectView getProjectView (int idProject, int idCitizen) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
		EntityManager em = emf.createEntityManager();
		Project project = 
				(Project) em.createQuery(
						"select p "
						+ "from Project p "
						+ "where id = :idProject")
				.setParameter("idProject", idProject)
				.getSingleResult();
		Object projectData = em.createNativeQuery(
				"select "
					+ "s.signatures, s.signed, "
					+ "cast(count(f1.id_citizen) as integer)as followers, "
					+ "f2.id_citizen as following "
				+ "from "
					+ "(select "
						+ "p.id as id_project, "
						+ "cast(count(s1.id_citizen) as integer) as signatures, "
						+ "s2.id_citizen as  signed "
					+ "from project p "
					+ "left join signature s1 "
						+ "on p.id = s1.id_project "
					+ "left join signature s2 "
						+ "on p.id = s2.id_project "
						+ "and s2.id_citizen = :idCitizen where p.id = :idProject "
					+ "group by p.id, s2.id_citizen) as s "
				+ "left join following f1 "
					+ "on s.id_project = f1.id_project "
				+ "left join following f2 "
					+ "on s.id_project = f2.id_project "
					+ "and f2.id_citizen = :idCitizen "
				+ "group by s.signatures, s.signed, f2.id_citizen;")
				.setParameter("idProject", idProject)
				.setParameter("idCitizen", idCitizen)
				.getSingleResult();
		em.close();
		ProjectView projectView = new ProjectView();
		projectView.setProject(project);
		projectView.setSignatures((int)(((Object[])projectData)[0]));
		projectView.setSigned(((Object[])projectData)[1] == null ? false : true);
		projectView.setFollowers((int)(((Object[])projectData)[2]));
		projectView.setFollowing(((Object[])projectData)[3] == null ? false : true);
//		MessageContext responseMessageContext;
//		try {
//			responseMessageContext = MessageContext.getCurrentMessageContext().getOperationContext().getMessageContext(  
//			           WSDLConstants.MESSAGE_LABEL_OUT_VALUE);
//			List headers = new ArrayList();  
//			headers.add(new Header(HTTPConstants., "identity"));  
//			responseMessageContext.setProperty(HTTPConstants.HTTP_HEADERS, headers);
//		} catch (AxisFault e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
		return projectView;
	}
	
	public List<ArgumentView> getArguments(int idProject, int idCitizen, boolean pro, int max, int offset) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
		EntityManager em = emf.createEntityManager();
		
		List<Object> argumentsData = em.createNativeQuery(
				"select a.id, cast(count(aa1.id_citizen) as integer) as agreements, aa2.id_citizen as agreed "
				+ "from argument a "
				+ "left join agreeargument aa1 "
				+ "on a.id = aa1.id_argument "
				+ "left join agreeargument aa2 "
				+ "on a.id = aa2.id_argument "
				+ "and aa2.id_citizen = :idCitizen "
				+ "where a.id_project = :idProject "
				+ "and a.pro = :pro "
				+ "group by a.id, aa2.id_citizen "
				+ "order by count(aa1.id_citizen) desc, a.id "
				+ "limit :max "
				+ "offset :offset ;")
				.setParameter("idCitizen", idCitizen)
				.setParameter("idProject", idProject)
				.setParameter("pro", pro)
				.setParameter("max", max)
				.setParameter("offset", offset)
				.getResultList();
		
		List<ArgumentView> argumentsView = new ArrayList<ArgumentView>();
		
		int argumentsIds[] = new int[argumentsData.size()];
		
		for (int i = 0; i < argumentsData.size(); i++) {
			ArgumentView argumentView = new ArgumentView();
			Object argumentData[] = (Object[])argumentsData.get(i);
			argumentView.setAgreements((int)argumentData[1]);
			argumentView.setAgreed(argumentData[2] == null ? false : true);
			argumentsIds[i] = (int)argumentData[0];
			argumentsView.add(argumentView);
		}
		
		List<Argument> arguments = em.createQuery(
				"select a.id, a.argument, a.pro, a.id_citizen, a_id_project "
				+ "from argument a "
				+ "left join agreeargument aa "
				+ "on a.id = aa.id_argument "
				+ "where a.id_project = :idProject "
				+ "and a.pro = :pro "
				+ "group by 1"
				+ "order by count(aa.id_citizen) desc, a.id "
				+ "limit :max "
				+ "offset :offset ;")
				.setParameter("idProject", idProject)
				.setParameter("max", max)
				.setParameter("offset", offset)
				.setParameter("pro", pro)
				.getResultList();
		
		return argumentsView;
	}
	
	public boolean isSketch (int idProject) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
		EntityManager em = emf.createEntityManager();
		boolean result = (boolean) em.createNativeQuery("select sketch from project where id=:idProject").setParameter("idProject", idProject).getSingleResult();
		em.close();
		return result;
	}
	
	//DELETE METHODS
	
	public boolean deleteKeyworded (Keyworded keyworded) {
		boolean deleted = false;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("DBAccessPU");
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = null;
			tx = em.getTransaction();
			tx.begin();
			int result = 
				em.createNativeQuery(
					"delete from keyworded "
					+ "where id_citizen = :idCitizen "
					+ "and id_project = :idProject "
					+ "and id_keyword = :idKeyword")
					.setParameter("idCitizen", keyworded.getIdCitizen())
					.setParameter("idProject", keyworded.getIdProject())
					.setParameter("idKeyword", keyworded.getIdKeyword())
					.executeUpdate();
			if (result > 0) deleted = true;
			tx.commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return deleted;
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
