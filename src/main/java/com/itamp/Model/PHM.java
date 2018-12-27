package com.itamp.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="phm")
public class PHM {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int phmId;
	 
	 @NotNull
	 private String name;
	 
	 @JsonBackReference
	 @ManyToOne
	 @JoinColumn(name="mohId")
	 private MOH moh;
	 
	 @JsonManagedReference
	 @OneToMany(mappedBy="phm" ,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 private List<GN> gn;
	 
	 public PHM() {}

	public PHM(int phmId, String name) {
		super();
		this.phmId = phmId;
		this.name = name;
	}

	public int getPhmId() {
		return phmId;
	}

	public void setPhmId(int phmId) {
		this.phmId = phmId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MOH getMoh() {
		return moh;
	}

	public void setMoh(MOH moh) {
		this.moh = moh;
	}

	public List<GN> getGn() {
		return gn;
	}

	public void setGn(List<GN> gn) {
		this.gn = gn;
	}
	 
	 
	
}
