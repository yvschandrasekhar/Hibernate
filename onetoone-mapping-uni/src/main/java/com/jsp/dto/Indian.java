package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Indian {
	@Id
	private int indianid;
	private String indianname;
	private String indianage;
	@OneToOne
	private PanCard pc;
	
	public PanCard getPc() {
		return pc;
	}
	public void setPc(PanCard pc) {
		this.pc = pc;
	}
	public int getIndianid() {
		return indianid;
	}
	public void setIndianid(int indianid) {
		this.indianid = indianid;
	}
	public String getIndianname() {
		return indianname;
	}
	public void setIndianname(String indianname) {
		this.indianname = indianname;
	}
	public String getIndianage() {
		return indianage;
	}
	public void setIndianage(String indianage) {
		this.indianage = indianage;
	}	
}
