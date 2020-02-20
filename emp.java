
 class emp
{
 int eno=101;
 void display()
	{
		eno=301;
		System.out.println(eno);
	}
}
class manager extends emp
{
	void display()
	{
		System.out.println("Manager calls");
	}
}
class Tst
{
	public static void main(String args[])
	{
		manager d=new manager();
		d.display();
	}
}