import java.util.Scanner;

public class q20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second string");
		String s2=sc.nextLine();
		sc.close();
		String s3=UserMainCode20.concatstring(s1,s2);
		System.out.println(s3);
	}
}
class UserMainCode20
{
	static String concatstring(String a,String b)
	{ 
		int x=a.length(),y=b.length(),diff=0;
		if(x==y)
		{
			return a.concat(b);
		}
		else
		{
			if(x>y)
			{
				diff=x-y;
				a=a.substring(diff);
				return a.concat(b);
			}
			else
			{
				diff=y-x;
				b=b.substring(diff);
				return a.concat(b);
			}
			
		}
	}
}