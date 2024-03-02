package com.onetomanyBi.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Outdoor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int outid;
	private String outdoorname;
	private String loc;
	
	@ManyToOne@JoinColumn
	private Sport sp;
	public Sport getSp() {
		return sp;
	}
	public void setSp(Sport sp) {
		this.sp = sp;
	}
	public int getOutid() {
		return outid;
	}
	public void setOutid(int outid) {
		this.outid = outid;
	}
	public String getOutdoorname() {
		return outdoorname;
	}
	public void setOutdoorname(String outdoorname) {
		this.outdoorname = outdoorname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
