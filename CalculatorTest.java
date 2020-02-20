package newproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase
{
/*	public CalculatorTest(String name)
	{
		super(name);	
	}*/
	public void testFactorialCalculator()
	{
		Calculator c=new Calculator();
		assertEquals(24,c.factorial(4));
	}
}
