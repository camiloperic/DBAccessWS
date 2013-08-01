package dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agreeargument", schema = "public")
public class Agreeargument implements java.io.Serializable {

	private static final long serialVersionUID = -5429482972035255083L;
	
	private AgreeargumentId id;

	public Agreeargument() {
	}

	public Agreeargument(AgreeargumentId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idArgument", column = @Column(name = "id_argument", nullable = false))})
	public AgreeargumentId getId() {
		return this.id;
	}

	public void setId(AgreeargumentId id) {
		this.id = id;
	}

}
