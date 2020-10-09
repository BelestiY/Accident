package com.acc.tool.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private String VehicleId;
	
	private String make;
	private String model;
	private String color;
	
	@OneToMany(mappedBy="vehicle")
	private Set<Motorist> motorist;

	@ManyToOne
	@JsonIgnore
	private Accident accident;

	public String getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(String vehicleId) {
		VehicleId = vehicleId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}