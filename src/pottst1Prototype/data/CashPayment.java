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
 * This class is used for Cash payments. It references the Payment class.
 */

public class CashPayment extends Payment
{
	public CashPayment(BigDecimal amount, String paymentMethod)
	{
		super(amount, paymentMethod);
	}
}
