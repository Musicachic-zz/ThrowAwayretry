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
 * This class contains the code that will support Credit Card payments in the
 * future. It contains the getter and setters related to it.
 */

public class CreditPayment extends Payment
{
	private String cardNum;
	private String expirationDate;

	public CreditPayment(BigDecimal amount, String paymentMethod, String cardNum, String expirationDate)
	{
		super(amount, paymentMethod);
		this.cardNum = cardNum;
		this.expirationDate = expirationDate;
	}

	/**
	 * This is the getter for the variable of cardNum which will be the
	 * credit card number.
	 *
	 * @return cardNum returns card number.
	 */
	public String getCardNum()
	{
		return cardNum;
	}

	/**
	 * This is the setter for the variable of cardNum,
	 * which will be the credit card number
	 *
	 * @param cardNum is the credit card number.
	 */
	public void setCardNum(String cardNum)
	{
		this.cardNum = cardNum;
	}

	/**
	 * This is the getter for the variable of credit card expiration date,
	 * which will be used when implementing payments.
	 *
	 * @return expirationDate returns the credit card expiration date.
	 */
	public String getExpirationDate()
	{
		return expirationDate;
	}

	/**
	 * This the setter for the variable of credit card expiration date,
	 * which will be used when implementing payments.
	 *
	 * @param expirationDate is the credit card expiration date.
	 */
	public void setExpirationDate(String expirationDate)
	{
		this.expirationDate = expirationDate;
	}
}
