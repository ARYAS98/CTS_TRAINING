import java.util.*;
public class q12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your password");
		String s=sc.nextLine();
		sc.close();
		int n=UserMainCode12.validatePassword(s);
		if(n==1)
		{
			System.out.println("valid format");
		}
		if(n==-1)
		{
			System.out.println("invalid format");
		}
		
	}
}
class UserMainCode12
{
	static int validatePassword(String s)
	{
		int flag=0;
		if((s.length()>6)&&(s.length()<20))
		{
			Boolean k=false;
			k=s.contains("@");
			k=s.contains("#");
			k=s.contains("$");
			if(k)
			{
				for(int i=0;i<s.length();i++)
				{ System.out.println("k");
					if (Character.isDigit(s.charAt(i)))
					{
						flag=1;
					}
					if(flag==1)
					{
						return 1;
					}
					else
					{
						return-1;
					}
				}
			}
		}
		//return -1;
	}
}