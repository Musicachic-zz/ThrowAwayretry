/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 04/06/2014
*          # Course Name: CITP 290
*          # Description: This contains the tests for the string
*          calculator.
*          ====================================================
*
*
*/

package pottst1_stringcalc;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * This class has the actual tests in it.
 */

public class StringCalculatorImplTest
{
	private StringCalculatorImpl calc;

	/**
	 * This class contains the call to the StringCalculatorImpl() method.
	 * @throws Exception
	 */

	@Before
	public void setUp() throws Exception
	{
		calc = new StringCalculatorImpl();
	}

	/**
	 * Addition Tests start here. This is the basic addition test.
	 * @throws Exception
	 */
	@Test
	public void testAdd() throws Exception
	{
		assertEquals("246", calc.add("123", "123"));
	}

	/**
	 * Adding negative numbers test.
	 * @throws Exception
	 */
	@Test
	public void testAdd_negative() throws Exception
	{

		assertEquals("2", calc.add("-5", "7"));
	}

	/**
	 * Attempt to add a letter and a number test.
	 * @throws NumberFormatException
	 */
	@Test//(expected = NumberFormatException.class)
	public void testAdd_NonNumeric() throws Exception
	{
		try
		{
			calc.add("A", "123");
			fail();
		}
		catch (NumberFormatException e)
		{

		}
	}

	/**
	 * Add decimals together test.
	 * @throws Exception
	 */

	@Test
	public void testAdd_decimal() throws Exception
	{
		assertEquals("2.1", calc.add("1.1", "1"));
		assertEquals("2.1", calc.add("1", "1.1"));
	}

	/**
	 * Add decimals together up to 10 decimal places test.
	 * @throws Exception
	 */
	@Test
	public void testAdd_decimalTenPlaces() throws Exception
	{
		assertEquals("2.0000000002", calc.add("1.0000000001", "1.0000000001"));
		assertEquals("2.123456789", calc.add("1.0000000000", "1.1234567890"));
	}

	/**
	 * Subtraction Tests start here. The basic subtraction test is here.
	 * @throws Exception
	 */

	@Test
	public void testSubtract() throws Exception
	{
		assertEquals("123", calc.subtract("246", "123"));
		assertEquals("-123", calc.subtract("123", "246"));
	}

	/**
	 * Subtraction test with negative numbers.
	 * @throws Exception
	 */
	@Test
	public void testSubtract_negative() throws Exception
	{
		assertEquals("-12", calc.subtract("-7", "5"));
		assertEquals("12", calc.subtract("7", "-5"));
		assertEquals("-2", calc.subtract("-7", "-5"));
		assertEquals("-12", calc.subtract("-5", "7"));
		assertEquals("12", calc.subtract("5", "-7"));
		assertEquals("2", calc.subtract("-5", "-7"));
	}

	/**
	 * Subtraction with a letter and numbers test.
	 * @throws NumberFormatException
	 */
	@Test
	public void testSubtract_NonNumeric() throws Exception
	{
		try
		{
			calc.subtract("A", "123");
			fail();
		}
		catch (NumberFormatException e)
		{

		}
	}

	/**
	 * Subtraction test with decimals.
	 * @throws Exception
	 */
	@Test
	public void testSubtract_decimal() throws Exception
	{
		assertEquals("2.1", calc.subtract("3.1", "1"));
		assertEquals("-2.1", calc.subtract("1", "3.1"));
	}

	/**
	 * Subtraction with 10 decimal places test.
	 * @throws Exception
	 */
	@Test
	public void testSubtract_decimalTenPlaces() throws Exception
	{
		assertEquals("1.0000000001", calc.subtract("2.0000000002", "1.0000000001"));
		assertEquals("3.0000000003", calc.subtract("2.0000000002", "-1.0000000001"));
		assertEquals("-1.0000000002", calc.subtract("-12.0000000002", "-11.00000000001"));
	}

	/**
	 * Multiplication tests start here. Basic mutiplication test.
	 * @throws Exception
	 */
	@Test
	public void testMultiply() throws Exception
	{
		assertEquals("12", calc.multiply("3", "4"));
		assertEquals("0", calc.multiply("0", "4"));
		assertEquals("0", calc.multiply("3", "0"));
		assertEquals("0.0000000000", calc.multiply("3", "0.0"));
	}

	/**
	 * Multiplication with negative numbers test.
	 * @throws Exception
	 */
	@Test
	public void testMultiply_negative() throws Exception
	{
		assertEquals("-12", calc.multiply("4", "-3"));
		assertEquals("-12", calc.multiply("-4", "3"));
	}

	/**
	 * Multiplication with a letter test.
	 * @throws NumberFormatException
	 */
	@Test
	public void testMultiply_NonNumeric() throws Exception
	{
		try
		{
			calc.multiply("A", "123");
			fail();
		}
		catch (NumberFormatException e)
		{

		}
	}

	/**
	 * Multiplication with a decimal test.
	 * @throws Exception
	 */
	@Test
	public void testMultiply_decimal() throws Exception
	{
		assertEquals("2.1", calc.multiply("2.1", "1"));
		assertEquals("2.1", calc.multiply("1", "2.1"));
	}

	/**
	 * Multiplication with decimals up to 10 digit places test.
	 * @throws Exception
	 */
	@Test
	public void testMultiply_decimalTenPlaces() throws Exception
	{
		assertEquals("9.987654321", calc.multiply("9.9876543210", "1"));
	}

	/**
	 * Division tests start here. These are the basic division tests.
	 * @throws ArithmeticException
	 */
	@Test
	public void testDivide() throws Exception
	{
		try
		{
			assertEquals("4", calc.divide("12", "3"));
			assertEquals("0", calc.divide("12", "0"));
			assertEquals("0", calc.divide("0", "12"));
			assertEquals("0", calc.divide("3", "0.0"));
			fail();
		}
		catch (ArithmeticException e)
		{

		}

	}

	/**
	 * This contains tests for division with negative numbers.
	 * @throws Exception
	 */
	@Test
	public void testDivide_negative() throws Exception
	{
		assertEquals("-4", calc.divide("-12", "3"));
		assertEquals("-4", calc.divide("12", "-3"));
	}

	/**
	 * This test is contains trying to divide a letter with a number.
	 * @throws NumberFormatException
	 */
	@Test
	public void testDivide_NonNumeric() throws Exception
	{
		try
		{
			calc.divide("A", "123");
			fail();
		}
		catch (NumberFormatException e)
		{

		}
	}

	/**
	 * This test contains dividing a decimal.
	 * @throws ArithmeticException
	 */
	@Test
	public void testDivide_decimal() throws Exception
	{
		try
		{
			assertEquals("2.1", calc.divide("2.1", "1"));
			assertEquals("0.4761904761", calc.divide("1", "2.1"));
			fail();
		}
		catch (ArithmeticException e)
		{

		}
	}

	/**
	 * This test contains dividing with 10 decimal places.
	 * @throws Exception
	 */
	@Test
	public void testDivide_decimalTenPlaces() throws Exception
	{
		assertEquals("9.987654321", calc.divide("9.987654321", "1"));
	}
}
