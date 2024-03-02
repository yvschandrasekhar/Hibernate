package com.onetomany.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acid;
	private String bankname;
	private int acNumber;
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(int acNumber) {
		this.acNumber = acNumber;
	}
	
}
