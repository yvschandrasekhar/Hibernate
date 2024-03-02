package com.jsp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sub_info")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subid;
	private String subname;
	private int subduration;
	@OneToOne
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getSubduration() {
		return subduration;
	}
	public void setSubduration(int subduration) {
		this.subduration = subduration;
	}
	
	public Subject() {
		
	}
	public Subject(String subname, int subduration, Teacher teacher) {
		super();
		this.subname = subname;
		this.subduration = subduration;
		this.teacher = teacher;
	}
	
	
	
}