package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AgreeCommentId implements java.io.Serializable {

	private static final long serialVersionUID = -4712610944991793903L;
	
	private int idCitizen;
	private int idComment;

	public AgreeCommentId() {
	}

	public AgreeCommentId(int idCitizen, int idComment) {
		this.idCitizen = idCitizen;
		this.idComment = idComment;
	}

	@Column(name = "id_citizen", nullable = false)
	public int getIdCitizen() {
		return this.idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	@Column(name = "id_comment", nullable = false)
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AgreeCommentId))
			return false;
		AgreeCommentId castOther = (AgreeCommentId) other;

		return (this.getIdCitizen() == castOther.getIdCitizen())
				&& (this.getIdComment() == castOther.getIdComment());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCitizen();
		result = 37 * result + this.getIdComment();
		return result;
	}

}
