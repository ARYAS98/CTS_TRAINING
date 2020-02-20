import java.util.*;
public class HashSetDemo
{
	public static void main(String args[])
	{
		Set hs=new HashSet();
		hs.add("Sandeep");
		hs.add("Thilaka");
		hs.add("Deepak");
		hs.add("Ellen");
		hs.add("Chithira");
		hs.add("Thilaka");
		hs.add("Ellen");
		hs.add(null);
		System.out.println(hs);
		TreeSet l=new TreeSet();
		l.add(30);
		//l.add(null);
		l.add(10);
		l.add(40);
		l.add(40);
		System.out.println(l);
	}
}
