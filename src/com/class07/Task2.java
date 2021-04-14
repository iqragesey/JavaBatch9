package com.class07;

public class Task2 {
	
	public static void main(String[] args) {
		
		System.out.println("Print 1 to 100");
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------print 100 to 1------");
		
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("------- print even numbers from 20 to 1, 1st way--------");
		
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("------ print even numbers from 20 to 1, 2nd way------");
		
		for(int i=20; i>=1; i--) {
			
			if(i % 2 == 0) {
				System.out.print(i+" ");
				
			}
		}
		
		System.out.println();
		System.out.println("-------- print odd numbers 20 to 50, 1st way ---------");
		
		for(int i=20; i<=50; i++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println("-------- print odd numbers 20 to 50, 2nd way ---------");
		
		for(int i =21; i<=50; i+=2) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		System.out.println("-------- WHAT IS MY OUTPUT??---------");
		
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			sum=sum+i;
			
			
		}
		System.out.println(sum);
		
	}
}
