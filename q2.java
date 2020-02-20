import java.util.*;
public class q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 digits in the given format");
		System.out.println("XXX-XXX-XXXX where 'X' is a digit");
		String s=sc.nextLine();
		sc.close();
		int n=UserMainCode2.validateNumber(s);
		if(n==1)
			System.out.println("Valid number format");
		else
			System.out.println("Invalid number format");
	}
}
class UserMainCode2
{
	static int validateNumber(String a)
	{
			if(a.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
				return 1;
			else
				return-1;
	}
}
