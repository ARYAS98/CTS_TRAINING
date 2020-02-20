
public class Variablle
{
	static int a;
	Variablle()
	{
	}
	void disp()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			Variablle se=new Variablle();
			se.disp();
		}
	}
}
