package dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "project", schema = "public")
public class Project implements java.io.Serializable {

	private static final long serialVersionUID = -2221712964772910898L;

	private Integer id;
	private int idCitizen;
	private Integer idParent;
	private boolean sketch;
	private String text;

	public Project() {
	}

	public Project(Integer id, int idCitizen, boolean sketch, String text) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.sketch = sketch;
		this.text = text;
	}

	public Project(Integer id, int idCitizen, int idParent, boolean sketch, String text) {
		this.id = id;
		this.idCitizen = idCitizen;
		this.idParent = idParent;
		this.sketch = sketch;
		this.text = text;
	}
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "id_citizen", nullable = false)
	public int getIdCitizen() {
		return this.idCitizen;
	}

	public void setIdCitizen(int idCitizen) {
		this.idCitizen = idCitizen;
	}

	@Column(name = "id_parent")
	public Integer getIdParent() {
		return this.idParent;
	}

	public void setIdParent(Integer idParent) {
		this.idParent = idParent;
	}

	@Column(name = "sketch", nullable = false)
	public boolean isSketch() {
		return this.sketch;
	}

	public void setSketch(boolean sketch) {
		this.sketch = sketch;
	}

	@Column(name = "text", nullable = false)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
