package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.TestClass;

public class TestClassJunit {
	
	TestClass tc;
	
	@Before
	public void init()
	{
		tc = new TestClass(25,"Ion");	
	}
	
	@Test
	public void testSetterNumar()
	{	
		int nr = 25;
		tc.setNumar(nr);
		Assert.assertEquals(nr, tc.getNumar());
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
