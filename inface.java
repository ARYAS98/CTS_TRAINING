interface Aa
{
	void met1();
}
interface Bb extends Aa
{
	void met2();
	void met3();
}
class x implements Bb
{
	public  void met1()//if we remove public it shows error bcz the methods have public as their visibility and if we dont specify anything then it will be default. default is low compared to public.
	{
		System.out.println("one");
	}
	public void met2()
	{
		System.out.println("two");
	}
	public void met3()
	{
		System.out.println("three");
	}
	void disp()
	{
		System.out.println("non abstract method");
	}
}
public class inface
{
	public static void main(String args[])
	{
		x a=new x();
		a.met1();
		a.met2();
		a.met3();
		a.disp();
	}
}
