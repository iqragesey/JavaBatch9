package com.class07;

public class Task {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------- Print numbers 1 to 100 ----------------------");
		
		int num=1;
		
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		System.out.println("---------------------- Print numbers 100 to 1 ----------------------");
		
		int a=100;
		
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println();
		System.out.println("---------------------- Print even numbers 20 to 100 ----------------------");
		
		int b=20;
		
		while(b<=100) {
			System.out.print(b+" ");
			b=b+2;
		}
		
	}

}
