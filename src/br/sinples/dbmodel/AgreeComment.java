package br.sinples.dbmodel;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agreecomment", schema = "public")
public class AgreeComment implements java.io.Serializable {

	private static final long serialVersionUID = -1436684808119919250L;
	
	private AgreeCommentId id;

	public AgreeComment() {
	}

	public AgreeComment(AgreeCommentId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCitizen", column = @Column(name = "id_citizen", nullable = false)),
			@AttributeOverride(name = "idComment", column = @Column(name = "id_comment", nullable = false))})
	public AgreeCommentId getId() {
		return this.id;
	}

	public void setId(AgreeCommentId id) {
		this.id = id;
	}

}
