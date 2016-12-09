
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CustAndTransServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  { 
     
  /*   String custid=request.getParameter("t1");
	 String custname=request.getParameter("t2"); 
     String custage=request.getParameter("t3");
	 String custprof=request.getParameter("t4");
	 String annualsal=request.getParameter("t5");
	 
	 String transid=request.getParameter("t6");
	 String transdate=request.getParameter("t7");
	 String transidamt=request.getParameter("t8");
	 String prdtcate=request.getParameter("t9");
	 String prdtname=request.getParameter("t10");
	 String transmode=request.getParameter("t11"); */
	 
	
     try
	 {
	    PrintWriter out=response.getWriter();
	
	  /*    FileWriter writer = new FileWriter("customer.txt", true);
            writer.write(custid);
			writer.write(",");
            writer.write(custname);
		    writer.write(",");
			writer.write(custage);
		    writer.write(",");
            writer.write(custprof);
			writer.write(",");
            writer.write(annualsal);
			writer.write("\r\n");
			writer.close();
			
		  FileWriter writer1=new FileWriter("transaction.txt",true);
            writer1.write(transid);
			writer1.write(",");
            writer1.write(transdate);
			writer1.write(",");
            writer1.write(custid);
			writer1.write(",");
            writer1.write(transidamt);
			writer1.write(",");
            writer1.write(prdtcate);
			writer1.write(",");
            writer1.write(prdtname);
			writer1.write(",");
            writer1.write(transmode);
			writer1.write("\r\n");
			writer1.close();   */
			
            
            String names[] = new String[]{"customer.txt", "transaction.txt"};
		    StringBuffer strContent = new StringBuffer(" ");

		    for (String file1 : names) 
			{
		      File file = new File(file1); 
		      int ch;
		      FileInputStream stream = null;  
		          stream = new FileInputStream(file);   
		      FileOutputStream out1 = new FileOutputStream("output.txt",true);
		          while( (ch = stream.read()) != -1) 
				  {
		              strContent.append((char) ch); 
				      out1.write((char)ch);
				  }
			}
				  
				  
			File file = new File("output.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) 
			{
				if(line.contains("Sports"))
				{
					System.out.println(line);
				}
				
				
	        
			}
			fileReader.close();
			 
			
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}