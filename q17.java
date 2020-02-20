import java.util.Scanner;

public class q17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an odd positive number");
		int number=sc.nextInt();
		sc.close();
		if((number>0)&&(number%2!=0))
		{
			int answer=UserMainCode17.addSeries(number);
			System.out.println(answer);
		}
		else
			System.out.println("enter an odd positive number");
	}
}
class UserMainCode17
{
	static int addSeries(int n)
	{ 
		int sum=1;
		if(n==1)
			return 1;
		else
		{
				for(int j=3,i=0;i<=(n/2)-1;i++,j=j+2)
				{
					if(i%2==0)
					{
						sum=sum+j;
					}
					else
					{
						sum=sum-j;
					}
				}
			return sum;
		}
	}
}