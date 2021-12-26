package com.example.designpatterns.chainofresponsibility;

public class MasterCardValidator extends CardValidator {

	public MasterCardValidator(CardValidator validator) {
		super(validator);
	}

	
	public void validate(Card card){
		 if (card.getType().equals("MASTER")) 
	        { 
	            System.out.println("Validating MASTER card"); 
	        } 
	        else
	        { 
	            super.validate(card); 
	        } 
    }; 
}
