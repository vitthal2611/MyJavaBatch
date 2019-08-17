package com.etp.abstraction;

public abstract class Phone {
	
	private String phoneModel;
	
	private String manufactureCompany;
	
	
	
	public Phone(String phoneModel, String manufactureCompany) {
		super();
		this.phoneModel = phoneModel;
		this.manufactureCompany = manufactureCompany;
	}

	// Function
	
	public void phoneVibrate() {
		System.out.println("Phone is vibrating");
	}
	
	public void phoneRinging() {
		System.out.println("Phone ringing");
	}
	
	public  void phoneDance(){};
	

}
