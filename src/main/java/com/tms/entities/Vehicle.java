package com.tms.entities;

import com.tms.enums.TypeOfVehicles;

public class Vehicle {

	private int id;
	private String vehicleNumber;
	private TypeOfVehicles typeOfVehicles;
	private String modelNumber;
	private String created_at;
	private String updated_at;
	private int status;

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public TypeOfVehicles getTypeOfVehicles() {
		return typeOfVehicles;
	}

	public void setTypeOfVehicles(TypeOfVehicles typeOfVehicles) {
		this.typeOfVehicles = typeOfVehicles;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

}
