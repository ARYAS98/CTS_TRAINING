import java.util.*;
public class q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a positive number");
		int number=sc.nextInt();
		sc.close();
		int n=0;
		if(number>0)
		{
			n=UserMainCode7.reverseNumber(number);
		}
		else
			System.out.println("enter a positive number");
		System.out.println(n);
		
	}
}
class UserMainCode7
{
	static int reverseNumber(int n)
	{
		int b,sum=0;
		while(n>0)
		{
			b=n%10;
			sum=sum*10+b;
			n=n/10;
		}
		return sum;
	}
}