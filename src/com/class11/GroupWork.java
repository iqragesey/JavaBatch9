package com.class11;

public class GroupWork {
public static void main(String[] args) {

	
	int [][] dmv= {
			
			{23,50,84,67},
			{9,678,21,43},
			{85,32,17,65},
			
	}; 
	
	for (int a=0; a<dmv.length; a++) {
		for (int b=0; b<dmv[a].length; b++) {
			if (dmv[a][b]%2==0) {
				System.out.println(dmv[a][b]);
			}
		}
	} 
	
	System.out.println("--------------------");
	
	int num = 4;
    boolean prime = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        prime = true;
        break;
      }
    }

    if (!prime)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
    
    
    System.out.println("-----------------------------");
    
    // write a program to find the second largest number in the array
    

}
}



