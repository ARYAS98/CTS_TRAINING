import java.util.*;
public class q15 
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
		d=UserMainCode15.getBigDiff(k);
		System.out.println(d);
	}
}
class UserMainCode15
{
	static int getBigDiff(int k[])
	{
		int s=k[0],i,b=k[0];
		for(i=0;i<k.length;i++)
		{
			if(k[i]<s)
			{
				s=k[i];
			}
			if(k[i]>b)
			{
				b=k[i];
			}
		}
		if(s==b)
		{
			return s;
		}
		else 
			return (b-s);
	}
}