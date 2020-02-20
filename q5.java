import java.util.*;
public class q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter a string");
		s=sc.nextLine();
		sc.close();
		int n=UserMainCode5.checkCharacters(s);
		if(n==1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
class UserMainCode5
{
	static int checkCharacters(String s)
	{
		int l=s.length();
		if((s.charAt(0))==(s.charAt(l-1)))
		{
			return 1;
		}
		else
		{
			return-1;
		}
	}
}