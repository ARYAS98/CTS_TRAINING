
public class A
{
	int x;
	int y;
	int get(int p,int q)
	{
		x=p;
		y=q;
		return(0);
	}
	void Show()
	{
		System.out.println(x);
	}
}
class B extends A
{
	public static void main(String args[])
	{
		B a=new B();
		a.get(5,6);
		a.Show();
		//a.Display();
	}
	void Show()
	{
		super.Show();
		System.out.println(y);
	}
}
