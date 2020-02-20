class xx
{
	int a=1000;
   void	xx()
	{
		System.out.println("A");
	}
}
class y extends xx
{
   void	y()
	{
		System.out.println("B");
	}
}
public class SSample
{
	public static void main(String args[])
	{
		y obj=new y();
		obj.xx();
		obj.y();
	}
}
