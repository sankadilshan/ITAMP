package com.itamp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mother")
public class Mother {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="motherId", nullable=false)
	private Long motherId;
	
	@Column(name="nic" ,nullable=false)
	private  String nic;
	@Column(name="name", nullable=false)
	private String name;
	@Column(name="registrationNo", nullable=false)
	private String registrationNo;
	@Column(name="wardNo",nullable=false)
	private String wardNo;
	@Column(name="bhtNo")
	private String bhtNo;
	//BHTNO
	@Column(name="delivaryDetails")
	private String delivaryDetails;
	@Column(name="delivaryStatus", nullable=false)
	private String delivaryStatus;
	@Column(name="infontStatus")
	private String infontStatus;
	
   /* @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="motherId", referencedColumnName="childId")
    private Child child; */
	
	public Mother() {}
	
	public Mother(Long motherId,String nic, String name, String registrationNo, String wardNo, String bhtNo, String delivaryDetails,
			String delivaryStatus, String infontStatus) {
		super();
		this. motherId= motherId;
		this.nic = nic;
		this.name = name;
		this.registrationNo = registrationNo;
		this.wardNo = wardNo;
		this.bhtNo = bhtNo;
		this.delivaryDetails = delivaryDetails;
		this.delivaryStatus = delivaryStatus;
		this.infontStatus = infontStatus;
		
	}

	public Long getMotherId() {
		return motherId;
	}

	public void setMotherId(Long motherId) {
		this.motherId = motherId;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getBhtNo() {
		return bhtNo;
	}

	public void setBhtNo(String bhtNo) {
		this.bhtNo = bhtNo;
	}

	public String getDelivaryDetails() {
		return delivaryDetails;
	}

	public void setDelivaryDetails(String delivaryDetails) {
		this.delivaryDetails = delivaryDetails;
	}

	public String getDelivaryStatus() {
		return delivaryStatus;
	}

	public void setDelivaryStatus(String delivaryStatus) {
		this.delivaryStatus = delivaryStatus;
	}

	public String getInfontStatus() {
		return infontStatus;
	}

	public void setInfontStatus(String infontStatus) {
		this.infontStatus = infontStatus;
	}
	
/*	
	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}
*/
	@Override
	public String toString() {
		return "Mother [motherId=" + motherId + ", nic=" + nic + ", name=" + name + ", registrationNo=" + registrationNo
				+ ", wardNo=" + wardNo + ", bhtNo=" + bhtNo + ", delivaryDetails=" + delivaryDetails
				+ ", delivaryStatus=" + delivaryStatus + ", infontStatus=" + infontStatus + "]";
	}
	
	

}
