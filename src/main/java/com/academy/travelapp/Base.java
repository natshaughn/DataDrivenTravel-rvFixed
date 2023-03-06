package com.academy.travelapp;

import java.util.UUID;

public class Base {
	private String name;
	private UUID id;

	public Base(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}

	public UUID getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void write(String sql) {
		try (/*TravelAppDB db = new TravelAppDB();*/ TravelApp app = new TravelApp()) {			
			app.write(sql);
		}
	}	
}