import java.util.*;
public class q8 
{
	public static void main(String args[])
	{
		ArrayList <Integer> a=new ArrayList<Integer>();
		ArrayList <Integer> b=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 elements of first arraylist");
		for(int i=0;i<5;i++)
			a.add(sc.nextInt());
		System.out.println("enter the 5 elements of second arraylist");
		for(int i=0;i<5;i++)
			b.add(sc.nextInt());
		sc.close();
		ArrayList <Integer> c=new ArrayList<Integer>();
		c=UserMainCode8.sortMergedArrayList(a,b);
		for(Integer o:c)
		System.out.println(o);
	}
}
class UserMainCode8
{
	static ArrayList<Integer> sortMergedArrayList(ArrayList <Integer> x,ArrayList<Integer> y)
	{
		ArrayList <Integer> z=new ArrayList<Integer>();
		x.addAll(y);
		Collections.sort(x);
		z.add(x.get(2));
		z.add(x.get(6));
		z.add(x.get(8));
		return z;
	}
}