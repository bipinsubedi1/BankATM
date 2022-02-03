package com.hcl.bankprogram;

public class InSufficientBalance extends Exception{
public InSufficientBalance () {
	super ("Invalid entry. Withdrawl amount is bigger than existing amount.");
}
public InSufficientBalance (String Message) {
	super (Message);
}
}
