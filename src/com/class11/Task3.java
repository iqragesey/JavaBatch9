package com.class11;

public class Task3 {
	
	public static void main(String[] args) {
		
		// Create 2D array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		String[][] cars= { 
				{"Ford","GMC", "Chevrolet"},
				{"Volkswagen", "Audi", "Benz"},
				{"Kia", "Hyundai"},
				{"Maserati", "Fiat", "Lambo"}
		};
		
		for(int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+" ");
				
			}
			System.out.println();
		}
		System.out.println("----------- advanced for loop----------");
		//advanced for loop
		
		for(String[] brands:cars) {
			for(String types:brands) {
				System.out.print(types+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------- question 2---------------");
	
		//Using 2D array create a grocery list.
		//Inside you should have an array of veggies, fruits, dairy and sweets. 
		//Retrieve all values from that array using 2 different loops
		
		String[][] groceries= {
				{"Potatoes", "carrots", "broccoli", "tomatoes"},
				{"Apples", "oranges", "grapes"},
				{"Milk", "eggs", "cheese", "creamers", "butter"},
				{"chocolate", "ice cream", "cookies"}
		};
		
		for(int r=0; r<groceries.length; r++) {
			for(int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------ advanced for loop ------ ");
		
		for(String[]values:groceries) {
			for(String list:values) {
				System.out.print(list+" ");
				
			}
			System.out.println();
				
			
		}

		
		
		
}
}