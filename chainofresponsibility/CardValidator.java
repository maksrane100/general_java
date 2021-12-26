package com.example.designpatterns.chainofresponsibility;

/**
 * 
 * Chain-of-responsibility pattern promotes loose coupling. Client sends request
 * to the chain of handlers and appropriate handler handles the request.
 * 
 * The chain of responsibility pattern creates a chain of receiver objects for a
 * request. This pattern decouples sender and receiver of a request based on
 * type of request. This pattern comes under behavioral patterns.
 */
public abstract class CardValidator {
	private CardValidator validator;

	public CardValidator(CardValidator validator) {
		this.validator = validator;
	};

	public void validate(Card card) {
		if (validator != null) {
			validator.validate(card);
		} else {
			System.out.println("Invalid card type.");
		}
	};
}
