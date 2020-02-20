import java.util.Scanner;
public class q14 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,d;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the array elements");
		int k[]=new int[n];
		for(i=0;i<n;i++)
		{
			k[i]=sc.nextInt();
		}
		sc.close();
		d=UserMainCode14.getSumOfPower(k);
		System.out.println(d);
	}
}
class UserMainCode14
{
	static int getSumOfPower(int k[])
	{
		int p,j,i,sum=0;
		for(i=0;i<k.length;i++)
		{
			p=1;
			for(j=0;j<i;j++)
			{
				p=p*k[i];
			}
			sum=sum+p;
		}
		return sum;
	}
}