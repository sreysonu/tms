package com.tms.dtos;

public class CustomerDTO {
	
	private String nameDTO;
	private String stateDTO;
	private String countryDTO;
	private int pincodeDTO;
	private int passengerCountDTO;

	public String getNameDTO() {
		return nameDTO;
	}
	public void setNameDTO(String nameDTO) {
		this.nameDTO = nameDTO;
	}
	
	public String getStateDTO() {
		return stateDTO;
	}
	
	public void setStateDTO(String stateDTO) {
		this.stateDTO = stateDTO;
	}
	
	public String getCountryDTO() {
		return countryDTO;
	}
	
	public void setCountryDTO(String countryDTO) {
		this.countryDTO = countryDTO;
	}
	
	public int getPincodeDTO() {
		return pincodeDTO;
	}
	
	public void setPincodeDTO(int pincodeDTO) {
		this.pincodeDTO = pincodeDTO;
	}
	
	public int getPassengerCountDTO() {
		return passengerCountDTO;
	}
	
	public void setPassengerCountDTO(int passengerCountDTO) {
		this.passengerCountDTO = passengerCountDTO;
	}
}
