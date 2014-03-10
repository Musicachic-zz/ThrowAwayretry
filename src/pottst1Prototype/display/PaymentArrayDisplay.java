/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/5/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.display;

import java.math.BigDecimal;
import java.util.List;

import pottst1Prototype.data.Payment;
import pottst1Prototype.display.FinishDisplay;

public class PaymentArrayDisplay
{

	public static void printPayments(List<Payment> payments){

		System.out.println("+---------------------------------------------------------+");
		int i = 1;
		for (Payment payment : payments)
		{
			String paymentMethod = payment.getPaymentMethod();
			BigDecimal amount = payment.getAmount();
			System.out.println( i++ + "Payment Method " + paymentMethod + "Payment Amount "  + amount);
		}
		System.out.println("+---------------------------------------------------------+");
		
		
	}
}
