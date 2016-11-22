package slt;

import java.lang.*;
public class RandomNum {
   
	public static void main(String args[])
	{
		
		  System.out.println("Random numbers between 1 and 100 are,");
		    for(int i=0; i < 10 ; i++)
		      System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*100));	
	
}
}
