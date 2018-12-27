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
@Table(name="moh")
public class MOH {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mohId;
	
	@NotNull
	private String name;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="dsId")
	private DS ds;
	
	@JsonManagedReference
	@OneToMany(mappedBy="moh" ,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<PHM> phm;
	
	public MOH() {}
	
	public MOH(int mohId, String name) {
		super();
		this.mohId = mohId;
		this.name = name;
	}
	
	
	public int getMohId() {
		return mohId;
	}
	public void setMohId(int mohId) {
		this.mohId = mohId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public DS getDs() {
		return ds;
	}

	public void setDs(DS ds) {
		this.ds = ds;
	}

	public List<PHM> getPhm() {
		return phm;
	}

	public void setPhm(List<PHM> phm) {
		this.phm = phm;
	}
	
	
	

}
