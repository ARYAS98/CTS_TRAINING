public interface TeachingStaff
	{
		void teach();
	}
public class Teacher implements TeachingStaff
{
	void teach()
	{
		System.out.println("teaching");
	}
}
public class Ssstudent implements TeachingStaff
{
	void teach()
	{
		System.out.println("Study");
	}
}
public class Qqq
{
	
	public static void main(String args[])
	{
		TeachingStaff d[]=new TeachingStaff[2];
		d[0].teach();
		d[1].teach();
		for(int i=0;i<2;i++)
		{
			d[i].teach();
		}
		
	}
}
