import java.util.*;
public class q18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String previous,current;
		int rate,price;
		System.out.println("enter the previous reading");
		previous=sc.nextLine();
		System.out.println("enter the current reading");
		current=sc.nextLine();
		System.out.println("enter the price of one unit");
		rate=sc.nextInt();
		price=UserMainCode18.calculateElectricityBill(previous,current,rate);
		if(price!=0)
			System.out.println(price);
		else
			System.out.println("enter correct values");
	}
}
class UserMainCode18
{
	static int calculateElectricityBill(String p,String c,int r)
	{
		int answer=0;
		if((p.length()==10)&&(c.length()==10))
		{
			String sub1=" ";
			String sub2=" ";
			sub1=p.substring(5);
			sub2=c.substring(5);
			int a,b;
			a=Integer.parseInt(sub1);
			b=Integer.parseInt(sub2);
			answer=(b-a)*r;
		}
		return answer;
	}
}