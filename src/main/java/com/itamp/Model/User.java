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
	@Column(name="firstName")
	private String firstname;
	@Column(name="lastname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="contactno")
	private String contactNo;
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="roleId" , referencedColumnName="roleId")
	private Role role;
	
	public User() {}
	
	public User(long id, String username, String firstname, String lastName, String password, String contactNo,
			String email) {
		super();
		this.id = id;
		this.username = username;
		this.firstname = firstname;
		this.lastName = lastName;
		this.password = password;
		this.contactNo = contactNo;
		this.email = email;
	
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
}
