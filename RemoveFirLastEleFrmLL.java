package slt;

import java.util.*;
public class RemoveFirLastEleFrmLL {

	public static void main(String args[])
	{
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("bharat");
		ll.add("navya");
		ll.add("kumar");
		ll.add("ajay");
		ll.add("vamshi");
		
		System.out.println(ll);
		
		ll.removeFirst();
		
		System.out.println(ll);
		
		ll.removeLast();
		
		System.out.println(ll);	
		
	
	}
	
}
