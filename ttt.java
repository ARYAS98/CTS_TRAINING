abstract class animal
{
	abstract void eat();
}
abstract class tiger extends animal
{
	void eat()
	{
		System.out.println("I only eat non veg");
	}

}
class goat extends animal
{
	void eat()
	{
		System.out.println("I only eat veg");
	}
}	
public class ttt
{
	public static void main(String args[])
	{
	animal m;
	//m=new tiger();
	//m.eat()
	//m.display();
	m=new goat();
	m.eat();
	}
}
