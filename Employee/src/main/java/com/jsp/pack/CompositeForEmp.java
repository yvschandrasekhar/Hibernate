package com.jsp.pack;

import java.io.Serializable;

import javax.persistence.Embeddable;
@SuppressWarnings("serial")
@Embeddable
public class CompositeForEmp implements Serializable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public CompositeForEmp() {
		
	}
	public CompositeForEmp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "CompositeForEmp [id=" + id + ", name=" + name + "]";
	}	    
}