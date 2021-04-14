package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		// we want to create an array that will store elements from a user: 
		// means we need to use scanner. 1st: declare array. 2nd: ask user

		Scanner scan;
		String[] array;
		
		scan=new Scanner(System.in);
		System.out.println("How many String elements would you like to store?");
		int size=scan.nextInt();
	//storing elements in this loop below	
		array=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter a String");
			array[i]=scan.next();
			
			
		}
	//printing/showing the elements	
		System.out.println("---- See what we've stored --------");
		
		for(String str:array) {
		System.out.print(str+" ");
		
	}
	}
}

