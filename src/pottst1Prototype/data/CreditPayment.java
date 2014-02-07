package pottst1Prototype.data;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

public class CreditPayment extends Payment
{
	private String cardNum;
	private String expirationDate;

	public String getCardNum()
	{
		return cardNum;
	}

	public void setCardNum(String cardNum)
	{
		this.cardNum = cardNum;
	}

	public String getExpirationDate()
	{
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate)
	{
		this.expirationDate = expirationDate;
	}
}
