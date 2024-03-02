package com.hibernate.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cricketers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cricketerid;
	private String cricketername;
	private String cricketteam;
	public int getCricketerid() {
		return cricketerid;
	}
	public void setCricketerid(int cricketerid) {
		this.cricketerid = cricketerid;
	}
	public String getCricketername() {
		return cricketername;
	}
	public void setCricketername(String cricketername) {
		this.cricketername = cricketername;
	}
	public String getCricketteam() {
		return cricketteam;
	}
	public void setCricketteam(String cricketteam) {
		this.cricketteam = cricketteam;
	}
	
	
}
