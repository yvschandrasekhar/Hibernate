package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String address;
	private int pannumber;
	@OneToOne
	private Indian id;
	public Indian getId() {
		return id;
	}
	public void setId(Indian id) {
		this.id = id;
	}
	public int getPanid() {
		return panid;
	}
	public void setPanid(int panid) {
		this.panid = panid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPannumber() {
		return pannumber;
	}
	public void setPannumber(int pannumber) {
		this.pannumber = pannumber;
	}
}
