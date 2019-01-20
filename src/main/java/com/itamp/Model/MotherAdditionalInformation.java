package com.itamp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Entity
@Table(name="additionalinfo")
public class MotherAdditionalInformation{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="infoid")
	private Long infoId;
	@Column(name="motherbhtno")
	private String motherBhtNo;
	@Column(name="ward")
	private String ward;
	@Column(name="birthcertificateno")
	private String birthCertificateNo;
	@Column(name="detailsofDelivary")
    private String detailsOfDelivary;
    @Column(name="complicationofdelivary")
    private String complicationOfDelivary;
    @Column(name="remarks")
    private String remarks;
    @Column(name="intantstatus")
    private String intantStatus;
    
    
   
    
  /*  public AdditionalInfo() {}

	public AdditionalInfo(long infoId, String motherBhtNo, String ward, String birthCertificateNo,
			String detailsOfDelivary, String complicationOfDelivary, String remarks, String intantStatus) {
		super();
		this.infoId = infoId;
		this.motherBhtNo = motherBhtNo;
		this.ward = ward;
		this.birthCertificateNo = birthCertificateNo;
		this.detailsOfDelivary = detailsOfDelivary;
		this.complicationOfDelivary = complicationOfDelivary;
		this.remarks = remarks;
		this.intantStatus = intantStatus;
	}
*/
	public long getInfoId() {
		return infoId;
	}

	public void setInfoId(long infoId) {
		this.infoId = infoId;
	}

	public String getMotherBhtNo() {
		return motherBhtNo;
	}

	public void setMotherBhtNo(String motherBhtNo) {
		this.motherBhtNo = motherBhtNo;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getBirthCertificateNo() {
		return birthCertificateNo;
	}

	public void setBirthCertificateNo(String birthCertificateNo) {
		this.birthCertificateNo = birthCertificateNo;
	}

	public String getDetailsOfDelivary() {
		return detailsOfDelivary;
	}

	public void setDetailsOfDelivary(String detailsOfDelivary) {
		this.detailsOfDelivary = detailsOfDelivary;
	}

	public String getComplicationOfDelivary() {
		return complicationOfDelivary;
	}

	public void setComplicationOfDelivary(String complicationOfDelivary) {
		this.complicationOfDelivary = complicationOfDelivary;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getIntantStatus() {
		return intantStatus;
	}

	public void setIntantStatus(String intantStatus) {
		this.intantStatus = intantStatus;
	}

	@Override
	public String toString() {
		return "AdditionalInfo [infoId=" + infoId + ", motherBhtNo=" + motherBhtNo + ", ward=" + ward
				+ ", birthCertificateNo=" + birthCertificateNo + ", detailsOfDelivary=" + detailsOfDelivary
				+ ", complicationOfDelivary=" + complicationOfDelivary + ", remarks=" + remarks + ", intantStatus="
				+ intantStatus + "]";
	}

	
    
}
