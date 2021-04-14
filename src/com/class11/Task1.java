package com.class11;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		// create an array on double values using scanner
		// calculate the sum of all stored elements in that array
		
		Scanner scan=new Scanner(System.in);
		
		double sum=0;
		
		System.out.println("Please enter the size of the array");
		int size= scan.nextInt();
		double [] array = new double [size];
		
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter double numbers");
			array[i]=scan.nextDouble();
			
			sum+=array[i];
			
		
			
		}
		System.out.println("The sum of "+size+" elements from an array = "+sum);
		
		
		
		
		
		
	}
}




