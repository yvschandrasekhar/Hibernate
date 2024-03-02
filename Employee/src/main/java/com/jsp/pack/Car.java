package com.jsp.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int id;
	private String name;
	private String Brand;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public Car() {
		
	}
	public Car(int id, String name, String brand, int cost) {
		super();
		this.id = id;
		this.name = name;
		Brand = brand;
		this.cost = cost;
	}
	
}
