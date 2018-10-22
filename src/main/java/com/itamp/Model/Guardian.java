package com.itamp.Model;

import javax.persistence.*;

@Entity
@Table(name="guardian")
public class Guardian {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long guardianId;
    @Column(name="nic" , unique=true)
	private String nic;
    private  String name;
    private String telephone;
    private String address;
    
    
    
	public Guardian() {	}


	public Guardian(String nic, String name, String telephone, String address) {
		super();
		this.nic = nic;
		this.name = name;
		this.telephone = telephone;
		this.address = address;
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


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getGuardianId() {
		return guardianId;
	}


	public void setGuardianId(Long guardianId) {
		this.guardianId = guardianId;
	}


	

}
