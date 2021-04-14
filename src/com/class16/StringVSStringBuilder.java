package com.class16;

public class StringVSStringBuilder {
	
	public static void main(String[] args) {
		
		for(int i=0; i<1000000000; i++) {
			String s=new String(String.valueOf(i));
			System.out.println(s);
			

		}
	}

}
