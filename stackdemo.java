import java.util.*;
public class stackdemo
{
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push("Pattrick Naughton");
		s.push("James Gosling");
		s.push("Mike Sheridian");
		s.push("Chris Warth");
		s.push("Ed Frank");
		System.out.println("stack elements : "+s);
		System.out.println("first elements : "+s.peek());
		System.out.println("stack elements : "+s);
		System.out.println("popping out : "+s.pop());
		System.out.println("stack elements : "+s);
		
		s.push("java");
		System.out.println("after adding : "+s);
		System.out.println("popping out : "+s.pop());
		
		System.out.println("system elements : "+s);
		System.out.println("first elements : "+s.peek());
		
		Enumeration e=s.elements();
		System.out.println("elements are : ");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
