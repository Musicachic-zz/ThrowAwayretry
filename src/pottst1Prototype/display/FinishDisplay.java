/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/25/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.display;

import pottst1Prototype.data.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class has the display for finishing the processing on a invoice
 * transaction and allowing a customer to pay for their products purchased.
 * @author Z. Hoffman + modifications by T. Potts
 */

public class FinishDisplay
{

	private List<Payment> payments = new ArrayList<Payment>();

	public static void paymentOptions()
	{
		System.out.println("Select a payment option: ");
		System.out.println("Cash");
		System.out.println("Credit");
		System.out.println("Check");

		Scanner sc = new Scanner(System.in);
		String paymentDisplayChoice = sc.next();

		if (paymentDisplayChoice.equalsIgnoreCase("Cash"))
		{
			System.out.println("You selected Cash");

		}

		if (paymentDisplayChoice.equalsIgnoreCase("Credit"))
		{
			System.out.println("You selected Credit");

		}

		if (paymentDisplayChoice.equalsIgnoreCase("Check"))
		{
			System.out.println("You selected Check");

		}
		else{
			System.out.println("Please enter valid payment option.");
			paymentOptions();
		}

	}

	public void askForAmount() {
		System.out.print("Payment Amount: ");
	}

	public void askForCreditCardNumber() {
		System.out.print("Credit Card Number: ");
	}

	public void askForExpirationDate() {
		System.out.print("Expiration Date: ");
	}

	public void askForAccountNumber() {
		System.out.print("Account Number: ");
	}

	public void askForRoutingNumber() {
		System.out.print("Routing Number: ");
	}

	public void askForCheckNumber() {
		System.out.println("Check Number: ");
	}

	public void cashSelected()
	{
		askForAmount();
		Scanner sc = new Scanner(System.in);
		String cashAmt = sc.nextLine();

		if (cashAmt==null || cashAmt.isEmpty()){
			System.out.println("Error: Please enter a valid cash amount.");
			cashSelected();
		}
		if (cashAmt != null && cashAmt.compareTo(String.valueOf(InvoiceDisplay
				   .getTotal()))<0){
			InvoiceDisplay.getTotal().subtract(new BigDecimal(cashAmt))
		}
	}
}
