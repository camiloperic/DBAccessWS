package dbmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "citizen", schema = "public", uniqueConstraints = {
		@UniqueConstraint(columnNames = "email"),
		@UniqueConstraint(columnNames = "cpf"),
		@UniqueConstraint(columnNames = "username")})
public class Citizen implements java.io.Serializable {

	private static final long serialVersionUID = 3207146821334483514L;

	private Integer id;
	private String username;
	private String passwd;
	private String name;
	private String cpf;
	private String email;

	public Citizen() {
	}

	public Citizen(Integer id, String username, String passwd, String name,
			String cpf, String email) {
		this.id = id;
		this.username = username;
		this.passwd = passwd;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
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

	@Column(name = "username", unique = true, nullable = false, length = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "passwd", nullable = false, length = 120)
	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Column(name = "name", nullable = false, length = 150)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cpf", unique = true, nullable = false, length = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "email", unique = true, nullable = false, length = 40)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
