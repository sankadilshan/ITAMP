package com.itamp.Model;


import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="rdhs")
public class RDHS {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int rdhsId;
	@NotNull
	private String name;
	@JsonManagedReference
	@OneToMany(mappedBy="rdhs" ,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<DS> ds;
	
	public RDHS() {}

	public RDHS(int rdhsId, String name) {
		super();
		this.rdhsId = rdhsId;
		this.name = name;
	}

	public int getRdhsId() {
		return rdhsId;
	}

	public void setRdhsId(int rdhsId) {
		this.rdhsId = rdhsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<DS> getDs() {
		return ds;
	}

	public void setDs(List<DS> ds) {
		this.ds = ds;
	}
	
	
}
