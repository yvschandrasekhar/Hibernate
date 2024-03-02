package com.jsp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String taechername;
	private String gender;
	private int experience;
	@OneToOne
	private Subject subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaechername() {
		return taechername;
	}
	public void setTaechername(String taechername) {
		this.taechername = taechername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher() {
		
	}
	public Teacher(String taechername, String gender, int experience, Subject subject) {
		super();
		this.taechername = taechername;
		this.gender = gender;
		this.experience = experience;
		this.subject = subject;
	}
	
}
