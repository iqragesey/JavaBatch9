package com.class11;

public class Notes {

	public static void main(String[] args) {


		int[] nums= {10, 12, 14, 44, 23, 78};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			
		
		}
		System.out.println("------- print backwards --------");
		
		for(int i=nums.length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
		
		//advanced for loop can be used only with arrays of collection
		
		// for(dataType variable name:nameOfTheArray){ 
		// SOPln(variable);
		
		//advanced for loop only prints front to end 
		// this loop never gets indexOutOfBound
		System.out.println("------ advanced for loop --------");
		
		for(int num:nums) {
			System.out.println(num);
		}
	}
	

}
