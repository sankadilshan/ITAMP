package com.itamp.Model;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="user")
public class User {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Id
	@NotBlank
	private String username;
	@NotBlank
	private String firstname;
	@NotBlank
	private String lastname;
	@NotBlank
	private String password;

	
	public User( String username, String firstName, String lastName, String password) {
		super();
		this.username = username;
		this.firstname = firstName;
		this.lastname = lastName;
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


	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + "]";
	}
   
}
