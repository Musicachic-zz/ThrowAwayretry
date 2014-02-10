/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

import java.math.BigDecimal;

/**
 * This class is used to create getters and setters for the payments. It also
 * contains the TAX_RATE constant of 6%.
 */

abstract class Payment
{
	public static final BigDecimal TAX_RATE = new BigDecimal(0.06);

	private BigDecimal amount;

	/**
	 * This is the getter for the amount someone will pay towards their
	 * invoice total.
	 *
	 * @return amount   This is the amount someone is paying towards their
	 *         invoice total.
	 */

	public BigDecimal getAmount()
	{
		return amount;
	}

	/**
	 * This is the setter for the amount someone will pay towards their
	 * invoice total.
	 *
	 * @param amount This is the amount someone will pay toward their invoice
	 *               total.
	 */

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}
}
