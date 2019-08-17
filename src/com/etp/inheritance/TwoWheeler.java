package com.etp.inheritance;

public class TwoWheeler extends Vehicle {
	
	public String wheler ="Two";

	public String model ="2020";

	public String vehicleType= "Two";
	
	int age=22;

	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void horn() {
		System.out.println("Horn - Two ");
	}
	public void  run() {
		System.out.println("running  - Two");
	}
}
