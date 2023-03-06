package com.academy.travelapp;

import java.util.List;

public class Users extends Base {
	protected static final String WRITE = "INSERT INTO Users (Id, name, age, location) VALUES ('%s', '%s', %d, '%s')";

	private int age;
	private String location;

	public Users(String name, int age, String location) {
		super(name);
		this.location = location;
		this.age = age;
		this.write(String.format(WRITE, this.getId().toString(), this.getName(), this.getAge(), this.getLocation()));
	}

	//Available Currency we offer 
	public void assignAvailable(RovrWallet rovrWallet) {

	}

	public int getAge() {
		return this.age;
	}

	public String getLocation() {
		return this.location;
	}

	public List <RovrWallet> getAvailable() {
		return null;
	}

}