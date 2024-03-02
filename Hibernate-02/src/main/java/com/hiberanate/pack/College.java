package com.hiberanate.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int collegeid;
	private String collegename;
	private String collegeloc;
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegeloc() {
		return collegeloc;
	}
	public void setCollegeloc(String collegeloc) {
		this.collegeloc = collegeloc;
	}
	
}
