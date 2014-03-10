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

public class CheckPayment extends Payment
{
	private String routingNum;
	private String accountNum;
	private String checkNum;

	public CheckPayment(BigDecimal amount, String paymentMethod, String routingNum, String accountNum, String checkNum)
	{
		super(amount, paymentMethod);
		this.routingNum = routingNum;
		this.accountNum = accountNum;
		this.checkNum = checkNum;
	}

	public String getRoutingNum()
	{
		return routingNum;
	}

	public void setRoutingNum(String routingNum)
	{
		this.routingNum = routingNum;
	}

	public String getAccountNum()
	{
		return accountNum;
	}

	public void setAccountNum(String accountNum)
	{
		this.accountNum = accountNum;
	}

	public String getCheckNum()
	{
		return checkNum;
	}

	public void setCheckNum(String checkNum)
	{
		this.checkNum = checkNum;
	}
}
