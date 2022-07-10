package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.currency.DenominationService;
import com.greatlearning.currency.MergeSort;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of denominations available");
		int size = sc.nextInt();
		int[] denominations = new int[size];
		System.out.println("Enter the value of denominations");
		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you need to pay");
		int payingAmount = sc.nextInt();
		MergeSort merge = new MergeSort();
		merge.mergeSort(denominations, 0, denominations.length - 1);
DenominationService ds = new DenominationService();
ds.notesCalculator(denominations, payingAmount);
	}

}
