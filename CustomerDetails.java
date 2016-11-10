/* reading from std output and writing to file and again reading that written file and displaying it on the VDU*/

package niit;
import java.io.*;
import java.util.Scanner;
public class CustomerDetails {

	public static void main(String args[]){
		byte CustId;
		String CustName;
		int CustAge;
		float CustSal;
		char grade;
		
		try{
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		System.out.println("Enter Customer id");
		CustId=Byte.valueOf(br.readLine());
		String Id1=String.valueOf(CustId);
		Id1=Id1.concat(",");
		
		
		System.out.println("Enter Customer name");
		CustName=br.readLine();
	//	CustName=CustName.concat(",");
		
		System.out.println("Enter Customer Age");
		CustAge=Integer.parseInt(br.readLine());
		String Id2=String.valueOf(CustAge);
		
		
		
		System.out.println("Enter Customer salary");
		CustSal=Float.parseFloat(br.readLine());
		String Id3=String.valueOf(CustSal);
		Id3=Id3.concat(",");
		
	/*	System.out.println("Enter grade");
		grade=(char)(br.read());*/
		
		System.out.println("Id is " +CustId);
		System.out.println("Name is " +CustName);
		System.out.println("Age is " +CustAge);
		System.out.println("Salary is " +CustSal);
	//	System.out.println("Grade is " +grade);
		
		
		FileOutputStream fobj=new FileOutputStream("e:\\sample.txt");
		//String str=String.valueOf(CustId);
		byte c[]=Id1.getBytes();
		fobj.write(c);
		
		String Id4=CustName.concat(",");
		fobj.write(Id4.getBytes());
		
	//	String str1=String.valueOf(CustSal);
		byte b[]=Id3.getBytes();
		fobj.write(b);
		
	//	fobj.write(grade);
		
	//	String str2=String.valueOf(CustAge);
		byte d[]=Id2.getBytes();
		fobj.write(d);
		
	
		
		BufferedReader br1=new BufferedReader(new FileReader("e:\\sample.txt"));
		
		String st;
		while((st=br1.readLine())!=null)
		{
			System.out.println(st);
		
		 String[] words = st.split(",");
         
		 System.out.println(words[1]  +words[3]);
		 
		}
		}
		catch(IOException ex)
		{
			System.out.println(ex.toString());
		}
		
		}	
		
	}

