public class LowPriority
{
	public static void main(String args[])
	{
		MyThread t1=new MyThread(1);
		MyThread t2=new MyThread(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
	}
}
	class MyThread extends Thread
	{
		int id;
		MyThread(int id)
		{
			this.id=id;
			start();
		}
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("My id is : "+id);
			}
		}
	}
