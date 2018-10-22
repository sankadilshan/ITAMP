package com.itamp.Model;

import javax.persistence.*;


@Entity
@Table(name="user")
public class User {
	
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id ;
	
	@Column(name="username", unique=true)
	private String username;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="password")
	private String password;
	
	public User() {}

	public User( String username, String firstname, String lastname, String password) {
		super();
	
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
