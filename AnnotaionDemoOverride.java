import java.util.*;

interface MyFunctionalInterface
{
	public String sayHello(String s);
}
public class AnnotaionDemoOverride
{
	public static void main(String args[])
	{
		MyFunctionalInterface msg=(name)->
		{
			return name;
		};
//		System.out.println(msg.sayHello("arya"));
		List<String> list=new ArrayList<String>();
		list.add("rick");
		list.add("negan");
		list.add("Caryl");
		list.add("glenn");
		list.add("Carl");
	/*	list.forEach(
			(names)->{System.out.println(names);}//name is the parameters

		);*/
		/*list
		.stream()
		.filter(s->s.startsWith("C"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);*/
		Arrays.stream(new int[] {1,2,3})
		.map(n->2*n+1)
		.average()
		.ifPresent(System.out::println);
	}
}