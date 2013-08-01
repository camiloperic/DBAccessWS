package dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "keyworded", schema = "public")
public class Keyworded implements java.io.Serializable {

	private static final long serialVersionUID = -1518027742659586550L;
	
	private KeywordedId id;

	public Keyworded() {
	}

	public Keyworded(KeywordedId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idProject", column = @Column(name = "id_project", nullable = false)),
			@AttributeOverride(name = "idKeyword", column = @Column(name = "id_keyword", nullable = false))})
	public KeywordedId getId() {
		return this.id;
	}

	public void setId(KeywordedId id) {
		this.id = id;
	}

}
