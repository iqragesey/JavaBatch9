package com.class09;

public class HW {

	public static void main(String[] args) {
		
		// print pattern 1 :
		
		for(int r=5; r>=1; r--) {
			
			for(int c=1; c<=5; c++) {
				
				System.out.print(r);
			}
			System.out.println();
		}
System.out.println("----------------");
		//print pattern 2:
		
		for(int r=1; r<=5; r++) {
			
			for(int c=7; c>=1; c--) {
				
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
