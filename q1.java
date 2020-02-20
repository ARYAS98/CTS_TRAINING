import java.util.*;
public class q1
{
	public static void main(String args[])
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive number");
		int number=sc.nextInt();
		sc.close();
		if(number>0)
		{
			 n=UserMainCode.checkSum(number);
		}
		if(number<0) 
		{
			System.out.println("enter a positive number");
		}
		if(n==1)
		{
			System.out.println("Sum of odd digits is odd");
		}
		if(n==(-1))
		{
			System.out.println("Sum of odd digits is even");
		}
		
	}
}
class  UserMainCode
{
	static int checkSum(int a)
	{
		int b,sum=0;
		while(a>0)
		{
			b=a%10;
			if(b/2!=0)
			{
				sum=sum+b;
			}
			a=a/10;
		}
		if(sum%2!=0)
		{
			return 1;
		}
		else
		{
			return(-1);
		}
	}
}
