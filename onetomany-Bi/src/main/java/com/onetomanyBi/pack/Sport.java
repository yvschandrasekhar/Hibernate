package com.onetomanyBi.pack;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Sport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sportid;
	private String sportname;
	private String sportcountry;
	@OneToMany(mappedBy = "sp" , fetch = FetchType.LAZY)
	
	private List<Outdoor>out;
	
	
	public List<Outdoor> getOut() {
		return out;
	}
	public void setOut(List<Outdoor> out) {
		this.out = out;
	}
	public int getSportid() {
		return sportid;
	}
	public void setSportid(int sportid) {
		this.sportid = sportid;
	}
	public String getSportname() {
		return sportname;
	}
	public void setSportname(String sportname) {
		this.sportname = sportname;
	}
	public String getSportcountry() {
		return sportcountry;
	}
	public void setSportcountry(String sportcountry) {
		this.sportcountry = sportcountry;
	}
	
}
