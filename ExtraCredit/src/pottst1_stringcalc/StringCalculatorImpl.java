/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 04/06/2014
*          # Course Name: CITP 290
*          # Description:  This contains the logic for implementing
*          the string calculator.
*          ====================================================
*
*
*/

package pottst1_stringcalc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * This class contains the logic for implementing the String Calculator.
 */
public class StringCalculatorImpl implements StringCalculator
{

	/**
	 * This method contains the logic to implement the addition string calculator.
	 * @param a
	 * First addend/operand.
	 * @param b
	 * Second addend/operand.
	 * @return
	 * @throws NumberFormatException
	 */
	@Override
	public String add(String a, String b) throws NumberFormatException
	{

		if (a.contains(".") || b.contains("."))
		{
			BigDecimal aa = new BigDecimal(a);
			BigDecimal bb = new BigDecimal(b);

			return aa.add(bb).setScale(10, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();

		}
		else
		{

			BigInteger aa = new BigInteger(a);
			BigInteger bb = new BigInteger(b);

			return aa.add(bb).toString();
		}
	}

	/**
	 * This method contains the logic to implement the subtraction string calculator.
	 * @param a
	 * First addend/operand.
	 * @param b
	 * Second addend/operand.
	 * @return
	 * @throws NumberFormatException
	 */
	@Override
	public String subtract(String a, String b) throws NumberFormatException
	{
		if (a.contains(".") || b.contains("."))
		{
			BigDecimal aa = new BigDecimal(a);
			BigDecimal bb = new BigDecimal(b);

			return aa.subtract(bb).setScale(10, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();

		}
		else
		{

			BigInteger aa = new BigInteger(a);
			BigInteger bb = new BigInteger(b);

			return aa.subtract(bb).toString();
		}
	}

	/**
	 * This method contains the logic to implement the multiplication string calculator.
	 * @param a
	 * First addend/operand.
	 * @param b
	 * Second addend/operand.
	 * @return
	 * @throws NumberFormatException
	 */
	@Override
	public String multiply(String a, String b) throws NumberFormatException
	{

		if (a.equals(BigDecimal.ZERO) || b.equals(BigDecimal.ZERO))
		{
			return String.valueOf(BigDecimal.ZERO);
		}
		else if (a.contains(".") || b.contains("."))
		{
			BigDecimal aa = new BigDecimal(a);
			BigDecimal bb = new BigDecimal(b);

			return aa.multiply(bb).setScale(10, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();

		}
		else
		{

			BigInteger aa = new BigInteger(a);
			BigInteger bb = new BigInteger(b);

			return aa.multiply(bb).toString();
		}
	}

	/**
	 * This method contains the logic to implement the division string calculator.
	 * @param a
	 * First addend/operand.
	 * @param b
	 * Second addend/operand.
	 * @return
	 * @throws NumberFormatException
	 */
	@Override
	public String divide(String a, String b) throws NumberFormatException, ArithmeticException
	{
		if (a.contains(".") || b.contains("."))
		{
			BigDecimal aa = new BigDecimal(a);
			BigDecimal bb = new BigDecimal(b);

			return aa.divide(bb).setScale(10, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();

		}
		else
		{

			BigInteger aa = new BigInteger(a);
			BigInteger bb = new BigInteger(b);

			return aa.divide(bb).toString();
		}
	}
}
