package slt;
import java.util.Scanner;
public class WordCount {

	public static void main(String args[])
	{  
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scr.nextLine();  
		
		int count=0;
       String str[]=s1.split(" ");
       for(int i=0;i<str.length;i++)
       {
    	   count++;
       }
         
       System.out.println(count);
	}

}
