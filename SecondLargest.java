package slt;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		int largest = 0;
		 int second_largest = 0;
		 
		for(int b:a){
		 
		if(largest < b){
		 
		      second_largest = largest;
		      largest =b;
		 
		 } else if(second_largest < b){
		 
		                second_largest = b;
		 
		}
		 
		}
		        System.out.println("First Max Number: "+largest);
		        System.out.println("Second Max Number: "+second_largest);
				
	}

	
}
