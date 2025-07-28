package com.sunbeam;

public class Vehicle implements Comparable<Vehicle>{
	private int VehicleId;
	private String model;
	private String type;
	private double price;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int vehicleId, String model, String type, double price) {
		this.VehicleId = vehicleId;
		this.model = model;
		this.type = type;
		this.price = price;
	}
	public int getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [ id = "+VehicleId+", Model = "+model+", Type = "+type+", Price = "+price+"]";
	}
	
	@Override
	public int compareTo(Vehicle other) {
		int diff = Double.compare(this.price,other.price);
		return diff;
	}
	
}
