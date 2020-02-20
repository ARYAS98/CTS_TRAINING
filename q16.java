import java.util.*;
public class q16 
{
	public static void main(String args[])
	{
		int a,n,i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		String b[]=new String[n];
		System.out.println("enter the string elements");
		for(i=0;i<n;i++)
		{
			b[i]=sc.next();
		}
		System.out.println("enter the string to check");
		s=sc.next();
		sc.close();
		a=UserMainCode16.getElementPosition(b,s);
		System.out.println(a);
	}

}
class UserMainCode16
{
	 static  int getElementPosition(String a[],String b)
	 {
		 int i,temp=0,value;
		 String t=" ";
		 for(i=0;i<a.length-1;i++)
		 {
			 for(int j=0;j<a.length-i-1;j++)
			 {
				 value= a[j].compareTo(a[j+1]);
				 if(value<0)
				 {
					 t=a[j];
					 a[j]=a[j+1];
					 a[j+1]=t;
				 }
			 }
		 }
		 for(i=0;i<a.length;i++)
		 {
			 if(a[i].equals(b))
			 {
				 temp=i;
			 }
		 }
		 return (temp+1);
	 }
}