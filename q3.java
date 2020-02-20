import java.util.*;
public class q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		sc.close();
		int s=UserMainCode3.sumOfSquaresOfEvenDigits(n);
		System.out.println(s);
	}
}
class UserMainCode3
{
	static int sumOfSquaresOfEvenDigits(int a)
	{
		int b,sum=0;
		while(a>0)
		{
			b=a%10;
			if(b%2==0)
			{
				sum=sum+(b*b);
			}
			a=a/10;
		}
		return sum;
	}
}