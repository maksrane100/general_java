package com.example.designpatterns.chainofresponsibility;

public class VisaCardValidator extends CardValidator {

	public VisaCardValidator(CardValidator validator) {
		super(validator);
	}

	
	public void validate(Card card){
		 if (card.getType().equals("VISA")) 
	        { 
	            System.out.println("Validating VISA card"); 
	        } 
	        else
	        { 
	            super.validate(card); 
	        } 
    }; 
}
