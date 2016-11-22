package slt;

public class CheckBinary {

	public static void main(String args[]) 
	{ 
		System.out.println("Is 101 a binary no. :" +Check(101));	
		System.out.println("Is 121 a binary no. :" +Check(121));
	} 
	
	public static boolean Check(int number) 
	{ 
		int n = number; 
	   while (n != 0) 
	   { 
		   if (n % 10 > 1) 
		   { 
			   return false; 
			} 
		   
		   n = n / 10; 
       } 
	   return true; 
	 }

	
}
