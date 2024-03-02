package com.onetomany.pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int unicode;
	private String uniname;
	private int unirank;
	private String unniloc;
	@OneToMany
	private List<College>coll;
	public List<College> getColl() {
		return coll;
	}
	public void setColl(List<College> coll) {
		this.coll = coll;
	}
	public int getUnicode() {
		return unicode;
	}
	public void setUnicode(int unicode) {
		this.unicode = unicode;
	}
	public String getUniname() {
		return uniname;
	}
	public void setUniname(String uniname) {
		this.uniname = uniname;
	}
	public int getUnirank() {
		return unirank;
	}
	public void setUnirank(int unirank) {
		this.unirank = unirank;
	}
	public String getUnniloc() {
		return unniloc;
	}
	public void setUnniloc(String unniloc) {
		this.unniloc = unniloc;
	}
	
}
