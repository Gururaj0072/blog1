package blog.sb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bloglogin")
public class blogLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String userName;
	private String userPassword;
	private String email;
	private String phNumber;
	
	public blogLogin () {}
	public blogLogin(String name, 
			String userName, String userPassword,
			String email, String phNumber) {
		this.name = name;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.phNumber = phNumber;
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long value) {
		this.id = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhNumber() {
		return this.phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
}
