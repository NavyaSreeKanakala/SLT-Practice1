package slt;
import java.util.Scanner;
public class ReverseNo {

	public static void main(String args[]){
    Scanner scr=new Scanner(System.in);
    System.out.println("Enter the no. to be reversed:");
    int n=scr.nextInt();
	int rev=0;
	
	while(n>0){
	
		n=n%10;
		rev=(rev*10)+n;
		n=n/10;

	}
	
	System.out.println("Reverse no:" +rev);
	
	
	}
	
}
