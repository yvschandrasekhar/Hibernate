package com.onetooneBI.pack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Identity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identityId;
	private String identityname;
	private long identitynumber;
	@JoinColumn
	@OneToOne
	private Person person;
	public int getIdentityId() {
		return identityId;
	}
	public void setIdentityId(int identityId) {
		this.identityId = identityId;
	}
	public String getIdentityname() {
		return identityname;
	}
	public void setIdentityname(String identityname) {
		this.identityname = identityname;
	}
	public long getIdentitynumber() {
		return identitynumber;
	}
	public void setIdentitynumber(long identitynumber) {
		this.identitynumber = identitynumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Identity [identityId=" + identityId + ", identityname=" + identityname + ", identitynumber="
				+ identitynumber +  "]";
	}
	
}
