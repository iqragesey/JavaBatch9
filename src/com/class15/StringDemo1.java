package com.class15;

public class StringDemo1 {
	
public static void main(String[] args) {
	
	String name="Azizi"; // short way to create an object of a string, create the object & specify the variable
	//mostly use this way because shorter syntax
	
	String name1=new String("Azizi"); //this is what we are actually doing. 
	
	System.out.println(name);
	//length-> number of characters in a string object
	
	System.out.println(name.length());
	
	name="       Iqra";
	int len=name.length();
	System.out.println(len);
	
	
	
	
	
}

}
