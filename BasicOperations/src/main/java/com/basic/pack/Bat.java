package com.basic.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int batid;
	private String batbrand;
	private int price;
	public int getBatid() {
		return batid;
	}
	public void setBatid(int batid) {
		this.batid = batid;
	}
	public String getBatbrand() {
		return batbrand;
	}
	public void setBatbrand(String batbrand) {
		this.batbrand = batbrand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bat [batid=" + batid + ", batbrand=" + batbrand + ", price=" + price + "]";
	}
	
}
