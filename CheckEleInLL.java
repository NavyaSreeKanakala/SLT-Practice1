package slt;

import java.util.*;

public class CheckEleInLL {
	
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("navya");
		ll.add("vamshi");
		ll.add("kumar");
		ll.add("bharat");
		ll.add("navya");
	
		
		
		System.out.println(ll.indexOf("navya"));
		System.out.println(ll.lastIndexOf("navya"));
		
		System.out.println(ll.indexOf("kumar"));
		System.out.println(ll.indexOf("kumar"));
		
	}

}
