package com.manytoone.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acid;
	private String bankname;
	private long number;
	@ManyToOne
	private Person per;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
}
