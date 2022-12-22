package com.finishing_school.model;

public class Users {

	private int id;
	private String name;
	private String email;
	
//	private address address;
	public Users( int id, String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", email=" + email + ", id=" + id + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	
	
}
