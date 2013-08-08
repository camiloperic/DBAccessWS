package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AgreeArgumentId implements java.io.Serializable {

	private static final long serialVersionUID = 5223262093678401582L;

	private int idCitizen;
	private int idArgument;

	public AgreeArgumentId() {
	}

	public AgreeArgumentId(int idCitizen, int idArgument) {
		this.idCitizen = idCitizen;
		this.idArgument = idArgument;
	}

	@Column(name = "id_citizen", nullable = false)
	public int getIdCitizen() {
		return this.idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	@Column(name = "id_argument", nullable = false)
	public int getIdArgument() {
		return this.idArgument;
	}

	public void setIdArgument(int idArgument) {
		this.idArgument = idArgument;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AgreeArgumentId))
			return false;
		AgreeArgumentId castOther = (AgreeArgumentId) other;

		return (this.getIdCitizen() == castOther.getIdCitizen())
				&& (this.getIdArgument() == castOther.getIdArgument());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCitizen();
		result = 37 * result + this.getIdArgument();
		return result;
	}

}
