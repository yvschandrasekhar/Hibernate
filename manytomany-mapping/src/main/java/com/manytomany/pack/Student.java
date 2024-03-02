package com.manytomany.pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studid;
	private String studname;
	private String loc;
	private int marks;
	@ManyToMany
	private List<Subject>sub;
	
	public List<Subject> getSub() {
		return sub;
	}
	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
