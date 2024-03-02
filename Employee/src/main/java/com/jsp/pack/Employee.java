package com.jsp.pack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private CompositeForEmp cfe;
	private String loc;
	private int sal;
	public CompositeForEmp getCfe() {
		return cfe;
	}
	public void setCfe(CompositeForEmp cfe) {
		this.cfe = cfe;
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
	public Employee() {
		
	}
	public Employee(CompositeForEmp cfe, String loc, int sal) {
		super();
		this.cfe = cfe;
		this.loc = loc;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [cfe=" + cfe + ", loc=" + loc + ", sal=" + sal + "]";
	}
	
}
