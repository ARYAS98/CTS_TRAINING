import java.util.*;
public class q29 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the string array");
		int size=sc.nextInt();
		String array[]=new String[size];
		System.out.println("enter the array elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.next();
		}
		System.out.println("enter the length of the string to be deleted");
		int length=sc.nextInt();
		sc.close();
		int reducedsize=userMainCode29.removeElements(size,array,length);
		System.out.println(reducedsize);
	}
}
class userMainCode29
{
	static int removeElements(int size,String array[],int length)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(array[i].length()==length)
				count++;
		}
		return (size-count);
	}
}