package dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "signature", schema = "public")
public class Signature implements java.io.Serializable {

	private static final long serialVersionUID = -5533642630004554302L;

	private SignatureId id;

	public Signature() {
	}

	public Signature(SignatureId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false))})
	public SignatureId getId() {
		return this.id;
	}

	public void setId(SignatureId id) {
		this.id = id;
	}

}
