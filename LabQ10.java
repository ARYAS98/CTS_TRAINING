import java.util.*;
public class LabQ10
{
	public static void main(String args[])
	{
		ArrayList<String> a= new ArrayList<String>();
		a.add("Sunday");
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednesday");
		a.add("Thursday");
		a.add("Friday");
		a.add("Saturday");
		System.out.println(a);
		System.out.println("The length is "+a.size());
		//for(Character o:a)
		//{
		//	System.out.println(o);
		//}
		String[] ar=new String[7];
		System.out.println(a.lastIndexOf("Saturday"));
		for(int i=0;i<7;i++)
		{
		ar[i]=a.get(i);
		System.out.println(ar[i]);
		}
		
		
	}
}
