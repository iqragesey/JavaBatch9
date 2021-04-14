package com.class09;

public class Recap {

	public static void main(String[] args) {

	
		for (int i =1; i<3; i++) {
			
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("------ Print 10 to 99 using nested loop --------");
		
		for (int i=0; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				System.out.println(i+""+j);
		}
		
	
	}
		System.out.println("------- car odomoter----");
		
		for (int a=0; a<=9; a++) {
			for (int b=0; b<=9; b++) {
				for (int c=0; c<=9; c++) {
					for (int d=0; d<=9; d++) {
						System.out.println(a+""+b+""+c+""+d);
					}
				}
				
				System.out.println("---------- CLOCK------");
				
				for (int h=0; h<24; h++) {
					
				
				for (int m = 0; m < 60; m++) {
					
				if (h<10 && m <10) {
					System.out.println("0"+ h +":0"+ m);
				} else if (h<10 && m >=10) {
					System.out.println("0"+h+":"+m);
				}else if (h>=10 && m <10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}

				System.out.println("---------- CLOCK USING NESTED IF ------");
				
				for (int h = 0; h<24; h++) {
					for (int m = 0; m< 60; m++) {
						
						if(h<10) {
							if (m<10) {
								System.out.println("0"+ h +":0"+ m);
							}else {
								System.out.println("0"+h+":"+m);
								
							}
						} else {
							if (m<10 ) {
								System.out.println(h+":0"+m);
							}else {
								System.out.println(h+":"+m);
							}
						}
							
							
		
							
								}
							}
							}
			System.out.println("----------------   multiplication table ----------------");
			
			for (int f=1; f<=4; f++) {
				for(int g=1; g<=10; g++) {
					int sum=f*g;
					System.out.println(f+" x "+g+" = "+sum);
						}
				}
}
		}
	}

