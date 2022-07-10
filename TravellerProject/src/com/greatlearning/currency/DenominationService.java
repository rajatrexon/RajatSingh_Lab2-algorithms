package com.greatlearning.currency;

public class DenominationService {
	public void notesCalculator(int[] denominations, int payingAmount) {
	try {
		
		for(int i = 0; i<denominations.length;i++) {
			if(payingAmount>=denominations[i]) {
				int count = payingAmount/denominations[i];
				System.out.println(count + " notes of " +denominations[i] +" required ");
				payingAmount = payingAmount - count*denominations[i];
			}
		}
		
	}catch(ArithmeticException e) {
		System.out.println(e + "--Don't enter Zero in denominations--");
	}
		
	
}
}
