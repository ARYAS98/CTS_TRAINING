import java.util.*;
public class LabQ6
{
	static String s;
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		try
		{
			int array[]=new int[-5];	
			for( i=0;i<=array.length;i++)
			{
				array[i]=sc.nextInt();
			}
		}
		catch(NegativeArraySizeException ex)
		{
			System.out.println("The exception is "+ex);
			ex.printStackTrace();
		}
		try
		{
			int array2[]= {1,2,3,4,5};
			System.out.println(array2[9]);
		}
		catch(ArrayIndexOutOfBoundsException ex1)
		{
			System.out.println("The exception is "+ex1);
			ex1.printStackTrace();
		}
		try
		{
			String name="Arya";
			System.out.println(name.charAt(7));
		}
		catch(StringIndexOutOfBoundsException ex2)
		{
			System.out.println("The exception is "+ex2);
			ex2.printStackTrace();
		}
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException ex3)
		{
			System.out.println("The exception is "+ex3);
			ex3.printStackTrace();
		}
		try
		{
			int a=30,b=0;
			System.out.println(a/b);
		}
		catch (ArithmeticException ex4)
		{
			System.out.println("The exception is "+ex4);
			ex4.printStackTrace();
		}
	}
}
