package slt;

import java.util.Scanner;

public class SumOfPrimeNos {

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int num = sc.nextInt();
		int sum=0;
		

	  for (int i = 1; i <= num; i++)
	  {
	    int count=0;
	   for (int j = 2; j <= i / 2; j++) 
	   { 
	    if (i % j == 0) 
	    {
	     count++;
	     break;
	    }
	   }
 
	 
	   if (count == 0) 
	   {
	    System.out.println(i);
	    sum=sum+i;
	    
	   }
	  
	  }
	  System.out.println("The sum is:" +sum);
	 
}
	
}
