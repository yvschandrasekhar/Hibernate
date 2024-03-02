package com.jsp.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Branchid;
	private String BranchName;
	private String BrancLoc;
	@ManyToOne
	private Hospital hos;
	
	public Hospital getHos() {
		return hos;
	}
	public void setHos(Hospital hos) {
		this.hos = hos;
	}
	public int getBranchid() {
		return Branchid;
	}
	public void setBranchid(int branchid) {
		Branchid = branchid;
	}
	public String getBranchName() {
		return BranchName;
	}
	public void setBranchName(String branchName) {
		BranchName = branchName;
	}
	public String getBrancLoc() {
		return BrancLoc;
	}
	public void setBrancLoc(String brancLoc) {
		BrancLoc = brancLoc;
	}
	
	
}
