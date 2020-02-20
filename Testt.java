class Studentt 
{
	String name1,name2;
	Studentt(String s)
	{
		this();
		name1=s;
		
	}
	Studentt()
	{
		System.out.println("s2=mary");
	}
	String getName()
	{
		return name1;
	}
}
public class Testt
{
	public static void main(String args[])
	{
		Studentt s1=new Studentt("john");
		System.out.println("s1="+s1.getName());
	}

}
