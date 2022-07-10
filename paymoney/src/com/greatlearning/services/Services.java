package com.greatlearning.services;

public class Services {

	public void determine(int[] transactionArray, int targetvalue) {
		int n = transactionArray.length;
		int sum = 0;
		int i = 0;
		while (sum <= targetvalue && i < n) {
			sum = sum + transactionArray[i];
			i++;
		}
		if (sum >= targetvalue) {
			System.out.println("Target achieved after " + (i) + "transactions");
		} else {
			System.out.println("target not achieved");
		}
	}

}
