package slt;

public class Test1 {
	public static void main(String args[])
	{
	 	String str="13-11-1993";
		String[] str1=str.split("-");
		String s1=str1[0];
		String s2=str1[1];
		String s3=str1[2];
		
		int dd=Integer.parseInt(s1);
		int mm=Integer.parseInt(s2);
		int yy=Integer.parseInt(s3);
		String date=String.valueOf(dd);
		String month=String.valueOf(mm);
		String year=String.valueOf(yy);
		System.out.println("dob:" +date +month  +year); 
	
		
	}

}
