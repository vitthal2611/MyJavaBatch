package com.etp.inheritance;

public class FourWheeler extends Vehicle {
	
	int age=44;
	
	public String wheler ="Four ";

	public String model ="4";

	public String vehicleType= "Four";

	public void horn() {
		System.out.println("Horn  four");
	}

	public void run() {
		System.out.println("running  four");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWheler() {
		return wheler;
	}

	public void setWheler(String wheler) {
		this.wheler = wheler;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
}
