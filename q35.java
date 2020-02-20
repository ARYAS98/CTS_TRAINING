import java.util.*;
public class q35 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("enter the first string");
		s1=sc.nextLine();
		System.out.println("enter the second string");
		s2=sc.nextLine();
		sc.close();
		int n=UserMainCode35.commonChars(s1,s2);
		System.out.println(n);
	}
}
class UserMainCode35
{
	static int commonChars(String a,String b)
	{
		int flag,count=0;
		char c;
		
		int pos = 1; 
		char[] characters = a.toCharArray(); 
		for (int i = 1; i < a.length(); i++)
		{
			int j;
			for (j = 0; j < pos; ++j)
			{
				if (characters[i] == characters[j])
				{
					
					break; 
				}
			}
			if (j == pos)
			{
				characters[pos] = characters[i];
				++pos;
			}
			else
			{
				characters[pos] = 0;
				++pos;
			}
		}
		for(int i=0;i<pos;i++)
			System.out.println(characters[i]);
		 String a1 = new String(characters);
		
		
		for(int i=0;i<a1.length();i++)
		{
			c=a1.charAt(i);
			if(c!=' ')
			{
			flag=0;
			for(int j=0;j<b.length();j++)
			{
				if(c==b.charAt(j))
				{
					count=count+1;
					flag++;
				}
			}
			if(flag>1)
				count--;
			}
		}
		return count;
	}
}



