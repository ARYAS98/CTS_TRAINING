import java.util.*;
public class q31
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		int s=UserMainCode31.addEvenOdd(arr);
		System.out.println(s);
	}
}
class UserMainCode31
{
	static int addEvenOdd(int a[])
	{
		int sqr=0,cube=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sqr=sqr+(a[i]*a[i]);
			}
			else
			{
				cube=cube+(a[i]*a[i]*a[i]);
			}
		}
		return cube+sqr;
		
	}
}