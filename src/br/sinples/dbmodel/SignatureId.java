package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SignatureId implements java.io.Serializable {

	private static final long serialVersionUID = -300624995427346422L;

	private int idCitizen;
	private int idProject;

	public SignatureId() {
	}

	public SignatureId(int idCitizen, int idProject) {
		this.idCitizen = idCitizen;
		this.idProject = idProject;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SignatureId))
			return false;
		SignatureId castOther = (SignatureId) other;

		return (this.getIdCitizen() == castOther.getIdCitizen())
				&& (this.getIdProject() == castOther.getIdProject());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCitizen();
		result = 37 * result + this.getIdProject();
		return result;
	}

}
