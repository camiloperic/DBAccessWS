package br.sinples.dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "keyword", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "keyword"))
public class Keyword implements java.io.Serializable {

	private static final long serialVersionUID = -6815026087108783536L;

	private Integer id;
	private String keyword;

	public Keyword() {
	}

	public Keyword(int id, String keyword) {
		this.id = id;
		this.keyword = keyword;
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

	@Column(name = "keyword", unique = true, nullable = false, length = 30)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
