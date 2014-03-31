/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/31/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package stringcalc;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class StringCalculatorImplTest
{
	private StringCalculatorImpl calc;

	@Before
	public void setUp() throws Exception
	{
		calc = new StringCalculatorImpl();
	}

	@Test
	public void testAdd() throws Exception
	{
		assertEquals("246", calc.add("123", "123"));
	}

	@Test
	public void testAdd_negative() throws Exception{

	assertEquals("2", calc.add("-5", "7"));
}

	@Test//(expected = NumberFormatException.class)
	public void testAdd_NonNumeric() throws Exception
	{
		try
		{
			calc.add("A", "123");
			fail();
		} catch (NumberFormatException e)
		{

		}
	}

	@Test
	public void testAdd_decimal() throws Exception{
		assertEquals("2.1", calc.add("1.1", "1"));
		assertEquals("2.1", calc.add("1", "1.1"));
	}

	@Test
	public void testAdd_decimaltenplaces() throws Exception{

	}

	@Test
	public void testSubtract() throws Exception
	{

	}

	@Test
	public void testMultiply() throws Exception
	{

	}

	@Test
	public void testDivide() throws Exception
	{

	}
}
