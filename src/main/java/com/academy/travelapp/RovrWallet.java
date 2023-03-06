package com.academy.travelapp;

//import java.util.List;

	//Animal
	public class RovrWallet extends Base {
		protected static final String WRITE = "INSERT INTO RovrWallet (Id, currency, userId, balance) VALUES ('%s', '%s', '%s', %d)";
		private int balance;
		protected String currency;

		public RovrWallet(String name) {
			super(name);
			this.balance = 50;
			this.write(String.format(WRITE, this.getId().toString(), this.getCurrency(), this.getId().toString(), this.getBalance()));
	}

	//Hunger
	public int getBalance() {
		return this.balance;
	}

	//Species
	public String getCurrency() {
		return this.currency;
	}

	//Feeds
	public void deposit() {

	}

	//Runs
	public void spend() {

	}

	public String getName() {
		return "Goodbye World";
	}


}
