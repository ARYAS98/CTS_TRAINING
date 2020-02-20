class TwoStrings
{
	synchronized static void print(String str1, String str2)
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ie)
		{
		}
		System.out.println(str2);
	}
}
class PrintStringThread implements Runnable
{
	Thread td;
	String str1,str2;
	PrintStringThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		td = new Thread(this);
		td.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
public class TestThread
{
	public static void main(String args[])
	{

		new PrintStringThread("hello "," there");
		new PrintStringThread("how are"," you");
		new PrintStringThread("thank you "," very much!");
	}
}
