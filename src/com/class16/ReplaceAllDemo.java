package com.class16;

public class ReplaceAllDemo {
	
	public static void main(String[] args) {
		
		String var1="Syntax is the best 43434 Batch nine is great";
		
		System.out.println(var1.replaceAll("[0-9]", ""));
		var1="835743897543fsdjkfnfsjgfdg";
		System.out.println(var1.replaceAll("[a-zA-Z]", ""));
		var1="87549584305ajfdsjkfAJSDFJFSDJF$%^&**#^#&";
		System.out.println(var1.replaceAll("[A-Za-z0-9]", ""));
		
		var1="fjdasnsk3fsfasd289a4u32";
		
		System.out.println(var1.replaceAll("[^AaEeIiOoUu]", ""));

	}

}
