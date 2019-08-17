package com.etp.inheritance;

public class Vehicle {

	public String wheler = "2";

	public String model = "2020";

	public String vehicleType = "Car";

	int age = 20;

	public Vehicle() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Vehicle(String wheler, String model, String vehicleType) {
		super();
		this.wheler = wheler;
		this.model = model;
		this.vehicleType = vehicleType;
	}

	public void horn() {
		System.out.println("Horn");
	}

	public void run() {
		System.out.println("running");
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
