package dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tagged", schema = "public")
public class Tagged implements java.io.Serializable {

	private static final long serialVersionUID = 1519558365369252140L;

	private TaggedId id;

	public Tagged() {
	}

	public Tagged(TaggedId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false)),
			@AttributeOverride(name = "idTag", column = @Column(name = "id_tag", nullable = false))})
	public TaggedId getId() {
		return this.id;
	}

	public void setId(TaggedId id) {
		this.id = id;
	}

}
