import java.util.*;
public class q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string having even length");
		String s=sc.nextLine();
		sc.close();
		String a="";
		if(s.length()%2==0)
		{
			 a=UserMainCode4.getMiddleChars(s);
		}
		else
			System.out.println("enter a string having even length");
		System.out.println(a);
	}
}
class UserMainCode4
{
	static String getMiddleChars(String s)
	{
		String a;
		int l;
		l=s.length();
		a=s.substring(((l/2)-1),((l/2)+1));
		return a;
	}
}