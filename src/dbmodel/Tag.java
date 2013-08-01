package dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tag", schema = "public")
public class Tag implements java.io.Serializable {

	private static final long serialVersionUID = -6254381101514140408L;

	private int id;
	private int idParent;
	private String tag;
	
	public Tag() {
	}

	public Tag(int id, String tag) {
		this.id = id;
		this.tag = tag;
	}
	
	public Tag(int id, int idParent, String tag) {
		this.id = id;
		this.idParent = idParent;
		this.tag = tag;
	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "id_parent")
	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	@Column(name = "tag", nullable = false, length = 30)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
