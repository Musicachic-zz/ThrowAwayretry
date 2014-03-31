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

import java.util.Scanner;

public class StringCalculatorApp implements StringCalculator
{
	private static Scanner sc = new Scanner(System.in);
	static String a = null;
	static String b = null;

	public StringCalculatorApp()
	{
	}

	@Override
	public String add(String a, String b) throws NumberFormatException
	{
		Integer aa = Integer.valueOf(a);
		Integer bb = Integer.valueOf(b);

		String cc = String.valueOf(aa+bb);

		return cc;

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

	public static void main(String args[])
	{

		StringCalculatorApp sca = new StringCalculatorApp();

		System.out.print("Would you like to add, subtract, multiply, or divide a string?");
		String mathChoice = sc.next();


		while (mathChoice != null){

		if (mathChoice.equalsIgnoreCase("ADD"))
		{
			System.out.print("What is the first string? ");
			String a = sc.next();
			System.out.print("What is the second string? ");
			String b = sc.next();
			sca.add(a, b);
		}
		else if(mathChoice.equalsIgnoreCase("SUBTRACT")){
			sca.subtract(a,b);

		}
		else if(mathChoice.equalsIgnoreCase("MULTIPLY")){
			sca.multiply(a,b);
		}
		else if(mathChoice.equalsIgnoreCase("DIVIDE")){
			sca.divide(a,b);
		}
		else{
			System.out.print("Please enter a valid option: ");
		}
			System.out.print("Please enter a valid option: ");
	}
	}


}
