package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {


		String [][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"}, //01234 - 0
				{"Philly", "Strassburg", "Pittsburg"}, //012 - 1
				{"Boston", "Quincy", "Springfield", "Burlington"},//0123 - 2 
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},//01234 - 3
				{"Miami", "Orlando", "Tampa", "Tallahassee"},//0123		- 4
		};
		
		System.out.println(usa.length);
		System.out.println(usa[0].length); // 5 elements
		System.out.println(usa[1].length); // 3 elements
		System.out.println(usa[2].length); //4 elements
		System.out.println(usa[3].length);//5 elements
		System.out.println(usa[4].length);//4 elements
		
		for(int r=0; r<usa.length; r++) { //outer loop for rows
			
			for(int c=0; c<usa[r].length; c++ ) {  //inner loop for columns
			
				System.out.print(usa[r][c]+" ");
		}
		System.out.println();
		
	}

		System.out.println(" ----- using nested for each loop -----");
		
		for(String[] cities:usa) { //getting the cities from the array
			
			for(String city:cities) { //getting the values from array and printing
				System.out.print(city+" ");
			}
			System.out.println();
		}
}
	
	
}