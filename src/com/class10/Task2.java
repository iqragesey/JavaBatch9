package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// question 1: names
		System.out.println("------ question 1: first way--------");
		String names[]= new String[4];
		names[0]="iqra";
		names[1]="christo";
		names[2]="cj";
		names[3]="rosa";
		
		System.out.println(names[1]);
		
		System.out.println("------ question 1: second way--------");
		
		String[] name= {"Iqra", "Christo", "CJ"};
		System.out.println(name[0]);

		
		System.out.println("------ question 2 --------");
		
		String[] words = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);

		System.out.println("--------------- ALL ELEMENTS FROM AN ARRAY -------------");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
