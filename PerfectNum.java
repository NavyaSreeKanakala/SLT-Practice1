package slt;

import java.util.Scanner;
public class PerfectNum {
	
	public static void main(String args[]){
		
		int temp=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scr.nextInt();
	
		for(int i=1;i<n;i++)
		{
			if((n%i)==0)
			{
				System.out.println(i);
				temp=temp+i;
			}
		}	
		
		if(n==temp)
		{
			System.out.println("The number is a perfect number");
		}
		
		
		
	}

}
