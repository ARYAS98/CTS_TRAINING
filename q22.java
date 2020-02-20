import java.util.Scanner;

public class q22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		sc.close();
		int valid=UserMainCode22.validateStrings(str);
		if(valid==1)
			System.out.println("valid");
		else
			System.out.println("invalid");
	}
}
class UserMainCode22
{
	static int validateStrings(String a)
	{
		
	}
}