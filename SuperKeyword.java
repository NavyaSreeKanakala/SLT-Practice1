package slt;


class Niit{  
	  int bigdata=21;  
	}  

public class SuperKeyword extends Niit {

          int bigdata=19;  
		      
		  void display()
		  {  
		   System.out.println(super.bigdata);  
		  }  
		  public static void main(String args[]){  
		   SuperKeyword b=new SuperKeyword();  
		   b.display();  
		     
		}  
}  

