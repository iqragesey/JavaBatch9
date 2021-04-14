package com.class09;

public class Patterns {

	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++) {// rows - outer loop
			
			for(int j=1; j<=8; j++) { //columns - inner loop
				
			System.out.print("* ");
		
}
			System.out.println();
			
}
		System.out.println("---------------------------------");
		
		for (int r=1; r<=4; r++) {
			
			for (int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		for (int r=1; r<=5; r++) {
			
			for(int c=6; c>=1; c--) {
				
				System.out.print(c+" ");
				
			
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		for(int r=1; r<=5; r++) {
			
			for (int c=1; c<=5; c++) {
				System.out.print(r);
				
				
			}
			System.out.println();
		}
		
		System.out.println("--------------  TRIANGLE  -------------------");
		
		for(int r =1; r<=5; r++) {
			
			for (int c=1; c<=r; c++) {
				
				System.out.print("* ");
				
				
			}
			System.out.println();
		}
		System.out.println("--------------  OPPOSITE TRIANGLE  -------------------");
		
		for(int r=5; r>=1; r--) {
			
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}
	
	
}
