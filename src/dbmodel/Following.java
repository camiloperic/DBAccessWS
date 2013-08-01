package dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "following", schema = "public")
public class Following implements java.io.Serializable {

	private static final long serialVersionUID = 8860991917032031803L;

	private FollowingId id;

	public Following() {
	}

	public Following(FollowingId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false))})
	public FollowingId getId() {
		return this.id;
	}

	public void setId(FollowingId id) {
		this.id = id;
	}

}
