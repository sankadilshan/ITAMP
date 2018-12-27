package com.itamp.Model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="ds")
public class DS {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dsId;
	
	@NotNull
	private String name;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="rdhsId")
	private RDHS rdhs;
	
	@JsonManagedReference
	@OneToMany(mappedBy="ds" ,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<MOH> moh;
	
	public DS(){}

	public DS(int dsId, String name) {
		super();
		this.dsId = dsId;
		this.name = name;
	}

	public int getDsId() {
		return dsId;
	}

	public void setDsId(int dsId) {
		this.dsId = dsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RDHS getRdhs() {
		return rdhs;
	}
	
	public void setRdhs(RDHS rdhs) {
		this.rdhs = rdhs;
	}

	public List<MOH> getMoh() {
		return moh;
	}

	public void setMoh(List<MOH> moh) {
		this.moh = moh;
	}
	
}
