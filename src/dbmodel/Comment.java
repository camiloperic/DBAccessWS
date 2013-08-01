package dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment", schema = "public")
public class Comment implements java.io.Serializable {

	private static final long serialVersionUID = -2834481125701913424L;

	private int id;
	private int idCitizen;
	private int idProject;
	private int idParent;
	private String comment;

	public Comment() {
	}

	public Comment(int id, int idCitizen, int idProject, String comment) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.comment = comment;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "id_citizen", nullable = false)
	public int getIdCitizen() {
		return this.idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	@Column(name = "id_project", nullable = false)
	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	@Column(name = "id_parent")
	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	@Column(name = "comment", nullable = false, length = 1024)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
