import java.util.*;
public class q13
{
	public static void main(String args[])
	{
		String s,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		sc.close();
		a=UserMainCode13.removeEvenVowels(s);
		System.out.println(a);
	}
}
class UserMainCode13
{
	static String removeEvenVowels(String s)
	{
		int i;
		char a;
		StringBuilder str =  new StringBuilder(s);  
		for(i=1;i<s.length();i=i+2)
		{
			a=s.charAt(i);
			if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
			{

			}
		}
		return s;
	}
}