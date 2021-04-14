package com.class10;

public class Task1 {

	public static void main(String[] args) {

		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		System.out.println("--------- Another way of creating an array ---------------");
		
		char[] grade= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		System.out.println(grade[6]);
		System.out.println("Number of elements in grade array "+grade.length);
		

		
	}

}
