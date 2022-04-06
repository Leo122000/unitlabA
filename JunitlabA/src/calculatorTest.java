import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class calculatorTest {
	static calculator c;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	  c = new calculator(4,2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//System.out.println("Release object");
		c.ReleaseObject();
	}

	@Before
	public void setUp() throws Exception {
		c.OpenDBcConnection();
	}

	@After
	public void tearDown() throws Exception {
		c.closeDBcConnection();
	}

	@Test
	public void testAdd() {
		//calculator c = new calculator(1,2);
		int result = c.Add();
		assertEquals(6,result);
		
	}
	@Test
	public void testSubtract()
	{
		//calculator c = new calculator(1,2);
		int result = (int) c.Subtract();
		assertEquals(2,result);
	}
	@Test
	public void testDivide()
	{
		//calculator c = new calculator(4,2);
		int result = (int) c.Divide();
		assertEquals(2,result);
	}
	@Test
	public void testMultiply()
	{
		//calculator c = new calculator(4,2);
		int result = (int) c.Multiply();
		assertEquals(8,result);
	}
	@Test
	public void validate()
	{
		//calculator c = new calculator(0,2);
		boolean bResult = c.validate();
		assertTrue(bResult);
	}

}
