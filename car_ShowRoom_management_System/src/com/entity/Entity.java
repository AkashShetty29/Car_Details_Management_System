package com.entity;

public class Entity {
	
	private int carId;
	private String carCompany;
	private String carName;
	private String carOwner;
	private String ownerPhone;
	private String licenseNo;
	
	
	public Entity(int carId, String carCompany, String carName, String carOwner, String ownerPhone, String licenseNo) {
	super();
	this.carId = carId;
	this.carCompany = carCompany;
	this.carName = carName;
	this.carOwner = carOwner;
	this.ownerPhone = ownerPhone;
	this.licenseNo = licenseNo;
}
	

	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCarId() {
		return carId;
	}





	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getCarCompany() {
		return carCompany;
	}


	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getCarOwner() {
		return carOwner;
	}


	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	


	public String getOwnerPhone() {
		return ownerPhone;
	}



	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	
	
	public String getLicenseNo() {
		return licenseNo;
	}



	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	



	@Override
	public String toString() {
		return "Entity [carId=" + carId + ", carCompany=" + carCompany + ", carName=" + carName + ", carOwner="
				+ carOwner + ", ownerPhone=" + ownerPhone + ", licenseNo=" + licenseNo + "]";
	}





	

}
