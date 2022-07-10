package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.Services;

public class Driverclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of transaction array");
int size = sc.nextInt();
int[] transactionArray = new int[size];
System.out.println("Enter the values of array");
for(int i = 0;i<transactionArray.length;i++) {
	System.out.println("enter value of no. "+(i+1) +" transaction" );
	transactionArray[i]=sc.nextInt();
}
System.out.println("Enter the total no. of targets that needs to be achieved");
int targets = sc.nextInt();
for(int i = 0 ; i<targets;i++) {
System.out.println("Enter the value of target");
int targetValue = sc.nextInt();
Services serv = new Services();
serv.determine(transactionArray, targetValue);
System.out.println();
}
	}

}
