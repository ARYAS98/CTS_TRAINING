import java.util.*;
public class q19 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		sc.close();
		int number=UserMainCode19.sumOfDigits(str);
		System.out.println(number);
	}
}
class UserMainCode19
{
	static int sumOfDigits(String a)
	{
		boolean stmt;
		int sum=0;
		for(int i=0;i<a.length();i++)
		{
			stmt=Character.isDigit(a.charAt(i));
			if(stmt)
			{
				sum=sum+Integer.parseInt(String.valueOf(a.charAt(i)));
			}
		}
		if(sum==0)
			return -1;
		else
			return sum;
	}
}