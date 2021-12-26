package com.example.designpatterns.chainofresponsibility;

public class Card {

	private String number;
	private String type;
	private int expirymonth;
	private int expiryyear;
	
	public Card(String number, String type, int expirymonth, int expiryyear) {
		super();
		this.number = number;
		this.type = type;
		this.expirymonth = expirymonth;
		this.expiryyear = expiryyear;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(int expirymonth) {
		this.expirymonth = expirymonth;
	}

	public int getExpiryyear() {
		return expiryyear;
	}

	public void setExpiryyear(int expiryyear) {
		this.expiryyear = expiryyear;
	}
	
	
	
	
	
}
