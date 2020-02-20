package newproject;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PrepareMyBagTest
{
	FirstDayAtSchool school;
	String[] bag= {"books","notebooks","pens"};
	
	@Before
	public void setUp() throws Exception
	{
		System.out.println("Initializing");
		school=new FirstDayAtSchool();
	}
	
	@Test
	public void testPrepareMyBag()
	{
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag,school.prepareMyBag());
	}
	
	@Test
	public void testCheckMyName()
	{
		System.out.println("Inside test Check name");
		school.checkMyName("arya");
		assertTrue(school.res);
	}
}