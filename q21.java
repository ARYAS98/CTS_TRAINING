import java.util.Scanner;

public class q21
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a color code");
		String colorcode=sc.nextLine();
		sc.close();
		int value=UserMainCode21.validateColorCode(colorcode);
		if(value==1)
		System.out.println("valid");
		else
			System.out.println("invalid");
	}
}
class UserMainCode21
{
	static int validateColorCode(String s)
	{
		int i;
		boolean k=true;
		if((s.charAt(0)=='#')&&(s.length()==7))
		{
			for(i=1;i<s.length();i++)
			{
				if((Character.isDigit(s.charAt(i)))||(Character.isLetter(s.charAt(i))))
				{
					
				}
				else
				{
					k=false;
					break;
				}
			}
		}
		else
			return -1;
		if(k==true)
			return 1;
		else
			return -1;
	}
}