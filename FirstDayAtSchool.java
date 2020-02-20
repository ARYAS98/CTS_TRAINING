package newproject;

import java.util.Arrays;

public class FirstDayAtSchool
{
	public boolean res;
	public void checkMyName(String myname)
	{
		if(myname.compareTo("arya")==0)
			res=true;
		else
			res=false;
	}
	public String[] prepareMyBag()
	{
		String[]schoolbag= {"books","notebooks","pens"};
		System.out.println("my school bag contains : " +Arrays.toString(schoolbag));
		return schoolbag;
	}
	public String[] addPencils()
	{
		String[] schoolbag= {"books","notebooks","pens","pencils"};
		System.out.println("now my bag contains : "+Arrays.toString(schoolbag));
		return schoolbag;
	}
	public static void main(String[] args)
	{
		FirstDayAtSchool fds=new FirstDayAtSchool();
		String[] sb=fds.prepareMyBag();
		System.out.println(sb);
		
		for(String s:sb)
			System.out.println("Bag contains :"+s);
		
		String[] pencil=fds.addPencils();
		
		for(String s:pencil)
			System.out.println("PencilBox contains : "+s);
	}
}
