import java.util.*;
public class q11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String a="";
		a=UserMainCode11.encrypt(s);
		System.out.println(a);
	}
}
class UserMainCode11
{
	 static String encrypt (String s)
	 {
		 StringBuilder sb = null;
		 sb=new StringBuilder(s);
		 for(int i=0;i<s.length();i=i+2)
		 {
			 int n;
			 	n=(int)s.charAt(i);
				sb.deleteCharAt(i);
			  sb.insert(i,((char)(n+1)));
		 }
		 return sb.toString();
	 }
}