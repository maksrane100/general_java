package com.example.designpatterns.chainofresponsibility;

public class TestChainOfResponsibility {
	public static void main(String[] args) {
		Chain chain = new Chain();

		// Calling chain of responsibility
		Card card = new Card("4434534534534624", "VISA",2,2024);
		chain.validate(card);

		Card card2 = new Card("3434534534532288", "AMEX",2,2028);
		chain.validate(card2);
		
		Card card3 = new Card("5434534534536622", "XYZ",2,2030);
		chain.validate(card3);
		
	}
}
