package com.composite.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CompositeKeyForEmployee {
	@Id
	@GenericGenerator(name="abc" , strategy = "com.composite.pack.CustomId")
	@GeneratedValue(generator = "abc")
	private String empId;
	private String name;
	private String loc;
	private int sal;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public CompositeKeyForEmployee(String empId, String name, String loc, int sal) {
		super();
		this.empId = empId;
		this.name = name;
		this.loc = loc;
		this.sal = sal;
	}
	
	public CompositeKeyForEmployee() {
		
	}
}
