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

public class CheckPayment extends Payment
{
	private String routingNum;
	private String accountNum;
	private String checkNum;

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
