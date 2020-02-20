import java.text.SimpleDateFormat;
import java.util.Date;

public class LabQ9
{
	public static void main(String args[]) throws Exception
	{
		String s="10/01/1998";
		Date f=new SimpleDateFormat("dd/MM/yyyy").parse(s);  
		 System.out.println(s+" "+f); 
	}
}
