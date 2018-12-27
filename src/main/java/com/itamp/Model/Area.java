package com.itamp.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="area")
public class Area {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="areaId")
	private Long areaId;
	@Column(name="rdhs")
	@NotNull
	private String rdhs;
	@Column(name="ds")
	@NotNull
	private String ds;
	@Column(name="moh")
	@NotNull
	private String moh;
	@Column(name="phm")
	@NotNull
	private String phm;
	@Column(name="gn")
	@NotNull
	private String gn;
	
	
	
	
	public Area() {}

	public Area(Long areaId, String rdhs, String ds, String moh, String phm, String gn) {
		super();
		this.areaId = areaId;
		this.rdhs = rdhs;
		this.ds = ds;
		this.moh = moh;
		this.phm = phm;
		this.gn = gn;
	}


	public Long getAreaId() {
		return areaId;
	}


	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}


	public String getRdhs() {
		return rdhs;
	}


	public void setRdhs(String rdhs) {
		this.rdhs = rdhs;
	}


	public String getDs() {
		return ds;
	}


	public void setDs(String ds) {
		this.ds = ds;
	}


	public String getMoh() {
		return moh;
	}


	public void setMoh(String moh) {
		this.moh = moh;
	}


	public String getPhm() {
		return phm;
	}


	public void setPhm(String phm) {
		this.phm = phm;
	}


	public String getGn() {
		return gn;
	}


	public void setGn(String gn) {
		this.gn = gn;
	}


   
}
