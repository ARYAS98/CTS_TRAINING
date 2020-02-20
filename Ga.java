
public class Ga
{
	 static void main()
	{
		System.out.println("second");
		
	}
	public static void main(String args[])
	{
		System.out.println("first");
		main();
		Ga d=new Ga();
		d.main(1);
		ggg j=new ggg();
		j.main();
	}
	void main(int a)
	{
		System.out.println("third");
	}
}
class ggg
{
	void main()
	{
		System.out.println("fourth");
	}
}
