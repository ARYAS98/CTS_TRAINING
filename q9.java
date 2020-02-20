import java.util.*;
import java.text.*;
import java.time.*;
public class q9
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		String s=sc.nextLine();
		sc.close();
		int n=UserMainCode9.validateDate(s);
		if(n==1)
		{
			System.out.println("valid format");
		}
		else
			System.out.println("invalid format");
	}
}
class UserMainCode9
{
	static int validateDate(String a)throws Exception
	{
		Date s = new SimpleDateFormat("dd/mm/yyyy").parse(a);
		SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy"); 
			String ss=d.format(s);
			if(ss.equals(a))
			{
				return 1;
			}
			else
				return -1;
		
	}
}