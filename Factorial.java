package slt;
import java.util.Scanner;
public class Factorial {

	public static void main(String args[]){
		int num=1;
		System.out.println("Enter the number:");
		Scanner scr=new Scanner(System.in);
		int x=scr.nextInt();
		
		while(x!=0)
		{
			num=num*x;
			x--;
		}
		System.out.println(num);
		
	}

}
