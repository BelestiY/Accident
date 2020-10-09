package com.acc.tool.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Accident {
	@Id
	@GeneratedValue
	private String accidentId;
	
    private String address;
    
    @OneToMany(mappedBy="accident")
    private Set<Vehicle> vehicle;
    
    private Motorist motorist;
    
	public String getAccidentId() {
		return accidentId;
	}
	public void setAccidentId(String accidentId) {
		this.accidentId = accidentId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Set<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public Motorist getMotorist() {
		return motorist;
	}
	public void setMotorist(Motorist motorist) {
		this.motorist = motorist;
	}
    
    
    
	
}
