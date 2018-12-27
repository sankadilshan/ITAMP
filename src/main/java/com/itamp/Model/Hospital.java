package com.itamp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="hospitalId")
	private Long hospitalId;
	@Column(name="hospitalName")
	private String hospitalName;
	@Column(name="city")
	private String city;
	
	public Hospital() {};
	
	public Hospital(Long hospitalId, String hospitalName, String city) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.city = city;
	}

	

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}
