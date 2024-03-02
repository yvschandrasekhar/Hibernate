package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="company_info")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int NoofEmployess;
	@OneToOne
	private GST gst;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoofEmployess() {
		return NoofEmployess;
	}
	public void setNoofEmployess(int noofEmployess) {
		NoofEmployess = noofEmployess;
	}
	public GST getGst() {
		return gst;
	}
	public void setGst(GST gst) {
		this.gst = gst;
	}
	
}
