package br.sinples.dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agreeargument", schema = "public")
public class AgreeArgument implements java.io.Serializable {

	private static final long serialVersionUID = -5429482972035255083L;
	
	private AgreeArgumentId id;

	public AgreeArgument() {
	}

	public AgreeArgument(AgreeArgumentId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idArgument", column = @Column(name = "id_argument", nullable = false))})
	public AgreeArgumentId getId() {
		return this.id;
	}

	public void setId(AgreeArgumentId id) {
		this.id = id;
	}

}
