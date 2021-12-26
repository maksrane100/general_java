package com.example.designpatterns.chainofresponsibility;

public class AmexCardValidator extends CardValidator {

	public AmexCardValidator(CardValidator validator) {
		super(validator);
	}

	
	public void validate(Card card){
		 if (card.getType().equals("AMEX")) 
	        { 
	            System.out.println("Validating AMEX card"); 
	        } 
	        else
	        { 
	            super.validate(card); 
	        } 
    }; 
}
