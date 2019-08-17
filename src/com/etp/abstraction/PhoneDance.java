package com.etp.abstraction;

public abstract class PhoneDance extends Phone {

	

	@Override
	public void phoneDance() {
		System.out.println("Phone Dancing");
		
	}
	public abstract void phoneFly();
	
	
	public PhoneDance(String phoneModel, String manufactureCompany) {
		super(phoneModel, manufactureCompany);
		// TODO Auto-generated constructor stub
	}
	
}
