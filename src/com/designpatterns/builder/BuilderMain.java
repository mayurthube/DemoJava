package com.designpatterns.builder;

public class BuilderMain {

	public static void main(String[] args) {

		Vehicle car = new Vehicle.VehicleBuilder("1500CC", 4).setAirbags(4).build(); 
		System.out.println("car ::"+car);
		
		Vehicle bike = new Vehicle.VehicleBuilder("1500CC", 4).build(); 
		System.out.println("bike ::"+bike);
	}

}
