package com.itamp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="gn")
public class GN {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gnId;
	
	@NotNull
	private String name;
	
	@JsonBackReference
	 @ManyToOne
	 @JoinColumn(name="phmId")
	 private PHM phm;
	
	public GN() {}

	public GN(int gnId, String name) {
		super();
		this.gnId = gnId;
		this.name = name;
	}

	public int getGnId() {
		return gnId;
	}

	public void setGnId(int gnId) {
		this.gnId = gnId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PHM getPhm() {
		return phm;
	}

	public void setPhm(PHM phm) {
		this.phm = phm;
	}
	
	
	

}
