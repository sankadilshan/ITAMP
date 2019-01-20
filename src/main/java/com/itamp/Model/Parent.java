package com.itamp.Model;

import javax.annotation.Resources;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.boot.model.relational.Exportable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Entity
@Table(name="parent")
public class Parent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="parentId", nullable=false)
	private Long parentId;	
	@Column(name="nic" ,nullable=false)
	private  String nic; //its be mother's nic
	@Column(name=" mothermaidenname", nullable=false)
	private String motherMaidenName;
	@Column(name="registrationNo", nullable=false)
	private String registrationNo;
	@Column(name="fathername")
	private String fatherName;
	@Column(name="fathernic")
	private String fatherNic;
	@Column(name="contactno")
	private String contactNo;
	@Column(name="multiplebirth")
	private Boolean multipleBirth;
	@Column(name="crs")
	private Boolean CRS; // congential rubbella syndrome;
	@Column(name="nnt")
	private Boolean NNT;   // neonatal tetanus
	
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="infoId",referencedColumnName="infoId")
	private MotherAdditionalInformation additional;
	
	public Parent() {};
	
	public Parent(Long parentId, String nic, String motherMaidenName, String registrationNo, String fatherName,
			String fatherNic, String contactNo, Boolean multipleBirth, Boolean cRS, Boolean nNT,
			MotherAdditionalInformation addinfo) {
		super();
		this.parentId = parentId;
		this.nic = nic;
		this.motherMaidenName = motherMaidenName;
		this.registrationNo = registrationNo;
		this.fatherName = fatherName;
		this.fatherNic = fatherNic;
		this.contactNo = contactNo;
		this.multipleBirth = multipleBirth;
		this.CRS = cRS;
		this.NNT = nNT;
		this.additional = addinfo;
	}
    



	public Long getParentId() {
		return parentId;
	}	
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getMotherMaidenName() {
		return motherMaidenName;
	}
	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getFatherNic() {
		return fatherNic;
	}
	
	
	public void setFatherNic(String fatherNic) {
		this.fatherNic = fatherNic;
	}
	
	
	public String getContactNo() {
		return contactNo;
	}
	
	
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public Boolean getMultipleBirth() {
		return multipleBirth;
	}


	public void setMultipleBirth(Boolean multipleBirth) {
		this.multipleBirth = multipleBirth;
	}


	public Boolean getCRS() {
		return CRS;
	}


	public void setCRS(Boolean cRS) {
		CRS = cRS;
	}


	public Boolean getNNT() {
		return NNT;
	}


	public void setNNT(Boolean nNT) {
		NNT = nNT;
	}


	public MotherAdditionalInformation getAddinfo() {
		return additional;
	}


	public void setAddinfo(MotherAdditionalInformation addinfo) {
		this.additional = addinfo;
	}


	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", nic=" + nic + ", motherMaidenName=" + motherMaidenName
				+ ", registrationNo=" + registrationNo + ", fatherName=" + fatherName + ", fatherNic=" + fatherNic
				+ ", contactNo=" + contactNo + ", multipleBirth=" + multipleBirth + ", CRS=" + CRS + ", NNT=" + NNT
				+ ", additional=" + additional + "]";
	}


	
		
		
    	
		

}
