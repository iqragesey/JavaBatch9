package com.class16;

public class Task1 {
	
	public static void main(String[] args) {
		
		//question1: create a string that will hold a sentence. write a program to get a new string w no spaces
		
		String var1="This is my sentence";
		System.out.println(var1.replace(" ",""));
		
		//question2: create a string that is a combination of letters, numbers & chars. find out how many alpha characters there are
		
		String var2="ABCDabcd1234!@#$";
		String alpha = var2.replaceAll("[^A-Za-z]","");
		System.out.println(alpha.length());	
		
		//question 3: how many sentences are in this string?
		
		String words="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] strArr=words.split("[?]");
		System.out.println(strArr.length);
		}

	
	}	


