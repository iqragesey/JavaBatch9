package com.class15;

public class ContainsDemo {
	public static void main(String[] args) {
		
		String var="this is a demo that contains #+=-!%$@#";
		
		System.out.println(var.contains("#"));
		if(var.contains("#") || var.contains("%")) {
			System.out.println("%, # are not allowed");
			
		}
		
		System.out.println(var.contains("this is a demo of"));
		
		System.out.println(var.startsWith("this is a demo"));
		
	}

}
