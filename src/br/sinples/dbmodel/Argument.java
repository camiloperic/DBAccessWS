package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "argument", schema = "public")
public class Argument implements java.io.Serializable {

	private static final long serialVersionUID = 6491768238368314786L;
	
	private Integer id;
	private int idCitizen;
	private int idProject;
	private String argument;
	private boolean pro;

	public Argument() {
	}

	public Argument(int id, int idCitizen, int idProject, String argument,
			boolean pro) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.argument = argument;
		this.pro = pro;
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

	@Column(name = "argument", nullable = false, length = 1024)
	public String getArgument() {
		return this.argument;
	}

	public void setArgument(String argument) {
		this.argument = argument;
	}

	@Column(name = "pro", nullable = false)
	public boolean isPro() {
		return this.pro;
	}

	public void setPro(boolean pro) {
		this.pro = pro;
	}

}
