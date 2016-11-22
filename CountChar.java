package slt;
import java.util.Scanner;
public class CountChar {

	public static void main(String args[])
	{
		int len=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scr.nextLine();
		
	    while(len!=1)
	    {
		  char[] c=str.toCharArray();
		  int count=0;
		
		 len=c.length;
		
		for(int j=0;j<len;j++)
        {
           if((c[0]==c[j])&&((c[0]>=65&&c[0]<=91)||(c[0]>=97&&c[0]<=123))) 
               count++;
        }
         if(count!=0)
         System.out.println(c[0]+" "+count+" Times");
         str=str.replace(""+c[0],"");          
       
		       
     
	    }
	
		}
		
	}	

