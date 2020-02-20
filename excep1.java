public class excep1
{
	static String s;
	public static void main(String args[])
	{
		//String s="hello";
		try
		{
			System.out.println(s.length());
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
	}
}
