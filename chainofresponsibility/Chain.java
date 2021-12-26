package com.example.designpatterns.chainofresponsibility;

public class Chain {
	CardValidator chain;

	public Chain() {
		buildChain();
	}

	private void buildChain() {
		chain = new VisaCardValidator(new MasterCardValidator(new AmexCardValidator(null)));
	}

	public void validate(Card card) {
		chain.validate(card);
	}

}