import java.util.StringTokenizer;
public class StringToken
{
	public static void main(String args[])
	{
		String longestword="";
		String s="please do, not touch ,my pet,aligator";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			String w=st.nextToken();
			if(w.length()>longestword.length())
			{
				longestword=w;
			}
		}
		System.out.println(longestword);
	}
}
