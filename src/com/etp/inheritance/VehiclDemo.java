package com.etp.inheritance;

public class VehiclDemo {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();

		TwoWheeler t = new TwoWheeler();

		FourWheeler f = new FourWheeler();

		System.out.println("#############  Vehicl ##########");

		System.out.println(v.age+" "+v.getModel() + "" + v.getVehicleType() + "" + v.getWheler());

		System.out.println("#############  Two Wheeler ##########");

		System.out.println(t.age+" "+t.getModel() + "" + t.getVehicleType() + "" + t.getWheler());

		System.out.println("#############  FOur Wheeler ##########");

		System.out.println(f.age+" "+f.getModel() + "" + f.getVehicleType() + "" + f.getWheler());

	}
}
