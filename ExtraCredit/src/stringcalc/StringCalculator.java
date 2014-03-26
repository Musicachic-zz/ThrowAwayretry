package stringcalc;

import org.junit.Test;

/**
 * Used to perform basic arithmetic operations on Strings. <br />
 * Any Strings sent as parameters to any of these methods are expected to be
 * convertible in to a single numeric value. If either String provided to a
 * method represents a non-whole numeric value (it has a fractional part, after
 * a decimal point) then the returned String is also expected to be returned
 * potentially containing a decimal point. <br />
 * Since the parameters and return values are being represented as Strings it
 * should be possible to represent values larger, smaller, or more precise than
 * what a regular int or double could hold (for example, multiplying integers
 * greater than one billion). However, returned decimal values may be rounded
 * off to 10 fractional digits, rounding up on half or higher.
 *
 * @author hoffmanz
 *
 */
public interface StringCalculator {

	/**
	 * Performs addition of the numeric values represented by the String
	 * parameters.
	 *
	 * @param a
	 *            First addend/operand.
	 * @param b
	 *            Second addend/operand.
	 * @return Sum of the numeric values represented by the first and second
	 *         operands.
	 * @throws NumberFormatException
	 *             if either operand does not represent a numeric value.
	 */
	String add(String a, String b) throws NumberFormatException;

	/**
	 * Performs subtraction of the numeric values represented by the String
	 * parameters.
	 *
	 * @param a
	 *            Minuend / first operand.
	 * @param b
	 *            Subtrahend / second operand.
	 * @return Difference of the numeric values represented by the first and
	 *         second operands.
	 * @throws NumberFormatException
	 *             if either operand does not represent a numeric value.
	 */
	String subtract(String a, String b) throws NumberFormatException;

	@Test
	/**
	 * Performs multiplication of the numeric values represented by the String
	 * parameters.
	 *
	 * @param a
	 *            First multiplicand/operand.
	 * @param b
	 *            Second multiplicand/operand.
	 * @return Product of the numeric values represented by the first and second
	 *         operands.
	 * @throws NumberFormatException
	 *             if either operand does not represent a numeric value.
	 */
	String multiply(String a, String b) throws NumberFormatException;

	/**
	 * Performs division of the numeric values represented by the String
	 * parameters.
	 *
	 * @param a
	 *            Dividend / first operand.
	 * @param b
	 *            Divisor / second operand.
	 * @return Quotient of the numeric values represented by the first and
	 *         second operands.
	 * @throws NumberFormatException
	 *             if either operand does not represent a numeric value.
	 * @throws ArithmeticException
	 *             if the divisor is zero.
	 */
	String divide(String a, String b) throws NumberFormatException,
			                                         ArithmeticException;
}
