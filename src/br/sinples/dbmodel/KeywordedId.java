package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class KeywordedId implements java.io.Serializable {

	private static final long serialVersionUID = -4926315876750578152L;
	
	private int idCitizen;
	private int idProject;
	private int idKeyword;

	public KeywordedId() {
	}

	public KeywordedId(int idCitizen, int idProject, int idKeyword) {
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.idKeyword = idKeyword;
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

	@Column(name = "id_keyword", nullable = false)
	public int getIdKeyword() {
		return this.idKeyword;
	}

	public void setIdKeyword(int idKeyword) {
		this.idKeyword = idKeyword;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KeywordedId))
			return false;
		KeywordedId castOther = (KeywordedId) other;

		return (this.getIdCitizen() == castOther.getIdCitizen())
				&& (this.getIdProject() == castOther.getIdProject())
				&& (this.getIdKeyword() == castOther.getIdKeyword());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCitizen();
		result = 37 * result + this.getIdProject();
		result = 37 * result + this.getIdKeyword();
		return result;
	}

}
