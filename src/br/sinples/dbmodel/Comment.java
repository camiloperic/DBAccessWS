package br.sinples.dbmodel;

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

	private Integer id;
	private int idCitizen;
	private int idProject;
	private Integer idParent;
	private String comment;

	public Comment() {
	}

	public Comment(Integer id, int idCitizen, int idProject, String comment) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.comment = comment;
	}

	public Comment(Integer id, int idCitizen, int idProject, Integer idParent, String comment) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.idParent = idParent;
		this.comment = comment;
	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
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
	public Integer getIdParent() {
		return this.idParent;
	}

	public void setIdParent(Integer idParent) {
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
