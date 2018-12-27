package com.itamp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="role")
public class Role {
	
	@Id
	@Column(name="roleId",unique=true)
	private int roleId;
	@Column(name="role")
	private String role;
	@Column(name="privilege")
	private String privilege;
	
	
	
	public Role() {}

	public Role(int roleId, String role,String privilege) {
		super();
		this.roleId = roleId;
		this.role = role;
		this.privilege =privilege;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	
	
	

}
