package com.onetomany.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class College {
	@Id
	@Column(name="clgid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int collegeid;
	@Column(name="clgname")
	private String collegename;
	@Column(name="clgrank")
	private int collegeRank;
	@Column(name="clgloc")
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
	public int getCollegeRank() {
		return collegeRank;
	}
	public void setCollegeRank(int collegeRank) {
		this.collegeRank = collegeRank;
	}
	public String getCollegeloc() {
		return collegeloc;
	}
	public void setCollegeloc(String collegeloc) {
		this.collegeloc = collegeloc;
	}
	
}
