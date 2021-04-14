package com.class13;

public class Dogs {
	
	public int age;
	public String breed;
	public String size;
	public String color;
	public String name;
	
	public void sleep() {
		System.out.println("zzzzzzz");
	}
	
	public void bark()  {
		System.out.println("ruff");
	}
	
	public void eat() {
		System.out.println("nom nom");
		
	}
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	
	public static void main(String[] args) {
		
		
		Dogs bullDog= new Dogs();
		
		bullDog.age=5;
		bullDog.breed="American Bulldog";
		bullDog.size="Large";
		bullDog.color="Brown";
		bullDog.bark();
		bullDog.eat();
		bullDog.sleep();
		bullDog.look();
		
		
		
	}
	

}
