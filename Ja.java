import java.util.*;
class Studenttt 
{
	String name;
	Studenttt(String s)
	{
		name=s;	
	}

	String getName()
	{
		return name;
	}
}
public class Ja
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//s1[0]=new Studenttt("mary");
		//s1[1]=new Studenttt("john");
		System.out.println("enter the number of names");
		int num=sc.nextInt();
		Studenttt s1[]=new Studenttt[num];
		for(int i=0;i<num;i++)
		{
			s1[i]=new Studenttt(sc.next());
		}
		sc.close();
		for(int i=0;i<num;i++)
		System.out.println("name is "+s1[i].getName());
	}
}
