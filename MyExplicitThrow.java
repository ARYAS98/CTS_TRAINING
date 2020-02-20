public class MyExplicitThrow
{
	public int getStringSize  (String s)
	{
		return s.length();
	}
	public static void main(String args[])
	{
		try
		{
			MyExplicitThrow met=new MyExplicitThrow();
			System.out.println("length of junk is "+met.getStringSize("JUNK"));
			System.out.println("length of wrong is "+met.getStringSize("wrong"));
			System.out.println("length of null String is "+met.getStringSize(null));// null is not a value but a references that why it is not given in quotes
		}
		catch(Exception ex)
		{
			System.out.println("exception message : "+ex.getMessage());
		}
	}
}
