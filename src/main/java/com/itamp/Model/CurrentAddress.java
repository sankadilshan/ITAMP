package com.itamp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="currentAddress")
public class CurrentAddress {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="addressId")
	private Long addressId;
	@Column(name="addressLine1" ,nullable=false)
	private String addressLine1;
	@Column(name="addressLine2")
	private String addressLine2;
	@Column(name="addressLine3")
	private String addressLine3;
	@Column(name="postalcode")
	private String postalCode;
	@Column(name="addressType")
	private String addressType;
	
	public CurrentAddress() {}
	
	public CurrentAddress(Long addressId, String addressLine1, String addressLine2, String addressLine3, String postalCode,
			String addressType) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.postalCode = postalCode;
		this.addressType = addressType;
	}

	public Long getAddId() {
		return addressId;
	}

	public void setAddId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
}
