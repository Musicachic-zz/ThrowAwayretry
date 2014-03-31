/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/30/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package stringcalc;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class StringCalculatorImpl implements StringCalculator
{
	public StringCalculatorImpl()
	{
	}

	@Override
	public String add(String a, String b) throws NumberFormatException
	{

		if(a.contains(".") || b.contains(".")){
			BigDecimal aa = (new BigDecimal(a));
			BigDecimal bb = (new BigDecimal(b));

			String cc = aa.add(bb).round(new MathContext(10)).toPlainString();

			return cc;

		}
		else{

		BigInteger aa = new BigInteger(a);
		BigInteger bb = new BigInteger(b);

		String cc = aa.add(bb).toString();

		return cc;
		}
	}

	@Override
	public String subtract(String a, String b) throws NumberFormatException
	{
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public String multiply(String a, String b) throws NumberFormatException
	{
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public String divide(String a, String b) throws NumberFormatException, ArithmeticException
	{
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}
}
