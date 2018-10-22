package com.itamp.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name="child")
public class Child {
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="childId", insertable=false, updatable=false)
    private Long childId;
    @Column(name="registrationId",unique=true)
	private String registrationId;
    @Column(name="registrationDate")
	private Date registrationDate;
    @Column(name="fullName")
	private String fullName;
    @Column(name="hin" , nullable=false)
    private String hin;
    @Column(name="dateOfBirth")
	private Date dateOfBirth;
    @Column(name="timeOfBirth" ,nullable=true)
	private Time timeOfBirth;
    @Column(name="gender")
    private String gender;
    @Column(name="birthWeight")
    private Float birthWeight;
    @Column(name="placeOfBirth")
	private String placeOfBirth;
    
   @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="childId", referencedColumnName="motherId")
   private Mother mother;
   
  /* @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="childId", referencedColumnName="guardianId")
   private Guardian guardian;
	*/
    public Child(){}

	

	public Child(String registrationId,Date registrationDate, String fullName, String hin, Date dateOfBirth,
			Time timeOfBirth, String gender, Float birthWeight, String placeOfBirth) {
		super();
		this.registrationId = registrationId;
		this.registrationDate = registrationDate;
		this.fullName = fullName;
		this.hin = hin;
		this.dateOfBirth = dateOfBirth;
		this.timeOfBirth = timeOfBirth;
		this.gender = gender;
		this.birthWeight = birthWeight;
		this.placeOfBirth = placeOfBirth;
	}



	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	

	public Date getRegistrationDate() {
		return registrationDate;
	}



	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public Time getTimeOfBirth() {
		return timeOfBirth;
	}



	public void setTimeOfBirth(Time timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}



	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Float getBirthWeight() {
		return birthWeight;
	}

	public void setBirthWeight(Float birthWeight) {
		this.birthWeight = birthWeight;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}



	public String getHin() {
		return hin;
	}



	public void setHin(String hin) {
		this.hin = hin;
	}



	public Long getChildId() {
		return childId;
	}



	public void setChildId(Long childId) {
		this.childId = childId;
	}



	public Mother getMother() {
		return mother;
	}



	public void setMother(Mother mother) {
		this.mother = mother;
	}

/*

	public Guardian getGuardian() {
		return guardian;
	}



	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	 */
	
}
