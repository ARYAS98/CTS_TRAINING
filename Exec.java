class ovl
{
	void disp()
	{
		System.out.println("hello");
	}
	void disp(int a)
	{
		System.out.println("world");
	}
}
public class Exec {
	public static void main(String args[])
	{
		ovl obj1=new ovl();
		obj1.disp(3);
	}

}
