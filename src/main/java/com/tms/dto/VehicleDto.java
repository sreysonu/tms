package com.tms.dto;

import com.tms.enums.TypeOfVehicles;

public class VehicleDto {
	private String vehicleNumber;
	private TypeOfVehicles typeOfVehicles;
	private String modelNumber;

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

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

}
