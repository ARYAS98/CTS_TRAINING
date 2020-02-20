import java.util.*;
public class q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		System.out.println("enter a number");
		int n=sc.nextInt();
		sc.close();
		String a="";
		if(n>0)
		{
			a=UserMainCode6.formNewWord(s,n);
		}
		else
		{
			System.out.println("enter a positive number");
		}
		System.out.println(a);
	}
}
class UserMainCode6
{
	static String formNewWord(String s,int c)
	{
		String a,b;
		int l=s.length();
		if(l>=(2*c))                      
		{
			a=s.substring(0,c);
			b=s.substring(l-c,l);
			return(a.concat(b));
		}
		else
			return "The given string length must be >=2n";
	}
}