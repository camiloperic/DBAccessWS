package dbmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TaggedId implements java.io.Serializable {

	private static final long serialVersionUID = 6182012934660653807L;

	private int idCitizen;
	private int idProject;
	private int idTag;

	public TaggedId() {
	}

	public TaggedId(int idCitizen, int idProject, int idTag) {
		this.idCitizen = idCitizen;
		this.idProject = idProject;
		this.idTag = idTag;
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

	@Column(name = "id_tag", nullable = false)
	public int getIdTag() {
		return this.idTag;
	}

	public void setIdTag(int idTag) {
		this.idTag = idTag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TaggedId))
			return false;
		TaggedId castOther = (TaggedId) other;

		return (this.getIdCitizen() == castOther.getIdCitizen())
				&& (this.getIdProject() == castOther.getIdProject())
				&& (this.getIdTag() == castOther.getIdTag());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCitizen();
		result = 37 * result + this.getIdProject();
		result = 37 * result + this.getIdTag();
		return result;
	}

}
