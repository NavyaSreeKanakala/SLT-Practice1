package slt;
import java.util.Scanner;
public class MagicNo {

	public static void main(String args[]){
		int sum=0,num;
		System.out.println("Enter a number");
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		
		while(n!=0)
		{
			num=n%10;
			sum=sum+num;
			n=n/10;
		
		}
		
		if((sum==1) || ((sum/10)==1 && (sum%10)==0))
		{
			System.out.println("number is a magic no.");
		}
		else
		{
			System.out.println("number is not a magic no.");
		}
			
	}

}
