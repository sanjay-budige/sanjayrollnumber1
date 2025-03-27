package com.practice.student.model;

public class Address {

	private String Id;

	private String state;

	private String country;

	private String street;

	private String hno;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

}
