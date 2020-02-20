import java.util.*;
public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap hm=new HashMap();
		hm.put("oop"," object oriented programming");
		hm.put("object","has state and behaviour");
		hm.put("class","define state and behaviour");
		System.out.println(hm);
		
		Set s=hm.entrySet();
		
		System.out.println();
		System.out.println("\n hashmap current size : "+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(" "+ob);
		}
		
		TreeMap tm=new TreeMap();
		tm.put("xava is","oop");
		tm.put("java is","simple");
		tm.put("zava is ","robust");
		tm.put("mava is","temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\n elements of treemap by iteration");
		System.out.println();
		
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			Object ob1=itr1.next();
			System.out.println(" "+ob1);
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		System.out.println("\n treemap current size :"+tm.size());
		tm.putAll(hm);
		System.out.println("\n putting a map into invoke map result will sort");
		System.out.println("\n"+tm);
		System.out.println(tm.remove("ram is")+" : i am removed value");
		System.out.println("\n treemap current size : "+tm.size());
		System.out.println("\n checking specific key/value status : "+tm.containsKey("java is")+tm.containsValue("temporary"));
		System.out.println("retrive value by key : "+ hm.get("oop"));
		
		Collection c=tm.values();
		System.out.println("\n values of my treemap : "+c);
		System.out.println("\n keys of treemap : "+tm.keySet());
	}
}
