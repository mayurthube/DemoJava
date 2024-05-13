package com.designpatterns.builder;

public class Vehicle {

	private String engine;
	private int wheels;
	private int airbags;
	
//	private Vehicle() {
//	}
	private Vehicle(VehicleBuilder vehicleBuilder) {
		this.engine = vehicleBuilder.engine;
		this.wheels = vehicleBuilder.wheels;
		this.airbags = vehicleBuilder.airbags;
	}
	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getAirbags() {
		return airbags;
	}
	
	public static class VehicleBuilder{
		public String engine;
		public int wheels;
		public int airbags;
		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		
		public Vehicle build() {
			return new Vehicle(this);
			
		}
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", airbags=" + airbags + "]";
	}
	
	
}
