package com.hcl.bankprogram;
import java.util.Scanner;
public class Bank {
public static void main (String[] args) {
	int existingBalance = 600;
	Scanner bankEntry = new Scanner (System.in);
	System.out.println ("Withdrawl amount: ");
	int withdrawlBalance = bankEntry.nextInt();
	try {
	int remainingBalance = existingBalance - withdrawlBalance;
	System.out.println ("Remaining balance: " + remainingBalance);
	if (remainingBalance < 0) {
		throw new InSufficientBalance ();
	} 
	}catch (InSufficientBalance e) {
		System.out.println (e.getMessage());
	}
}
}
