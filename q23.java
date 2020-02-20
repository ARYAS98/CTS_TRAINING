import java.util.*;
public class q23
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println("enter the size of the hashmap");
		int size=sc.nextInt();
		System.out.println("enter the hashmap details");
		for(int i=0;i<size;i++)
		{
			hm.put(sc.nextInt(),sc.nextLine());
		}
		sc.close();
		int n=UserMainCode23.sizeOfResultandHashMap(hm);
		System.out.println(n);
	}
}
class UserMainCode23
{
	static int sizeOfResultandHashMap(HashMap< Integer,String> hm)
	{
		int x,count=0;
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			x=(int)me.getKey();
			if(x%4!=0)
			{
				count++;
			}
		}
		return count;
	}
}