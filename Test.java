class Student 
{
	String name;
	Student(String s)
	{
	}
	void setName(String na)
	{
		name=na;
	}
	String getName()
	{
		return name;
	}
}
public class Test//
{
	public static void change(Student p)//change is static name
	{
	p.setName("Mary");
	}
	public static void main(String args[])
	{
		Student s1=new Student("john");
		change(s1);
		System.out.println("s1="+s1.getName());
	}
}//
