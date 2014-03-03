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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class has the display for finishing the processing on a invoice
 * transaction and allowing a customer to pay for their products purchased.
 *
 * @author Z. Hoffman + modifications by T. Potts
 */

public class FinishDisplay
{

	private static List<String> payments = new ArrayList<>();
	public static BigDecimal remainingTotal;

	public static void paymentOptions()
	{
		System.out.print("Select a payment option: Cash, Credit, or Check: ");

		Scanner sc = new Scanner(System.in);
		String paymentDisplayChoice = sc.next();

		if (paymentDisplayChoice.equalsIgnoreCase("Cash"))
		{
			System.out.println("You selected Cash");
			cashSelected();
		}

		if (paymentDisplayChoice.equalsIgnoreCase("Credit"))
		{
			System.out.println("You selected Credit");

		}

		if (paymentDisplayChoice.equalsIgnoreCase("Check"))
		{
			System.out.println("You selected Check");

		}
		else
		{
			System.out.println("Please enter valid payment option.");
			paymentOptions();
		}

	}

	public static void askForAmount()
	{
		System.out.print("Payment Amount: ");
	}

	public void askForCreditCardNumber()
	{
		System.out.print("Credit Card Number: ");
	}

	public void askForExpirationDate()
	{
		System.out.print("Expiration Date: ");
	}

	public void askForAccountNumber()
	{
		System.out.print("Account Number: ");
	}

	public void askForRoutingNumber()
	{
		System.out.print("Routing Number: ");
	}

	public void askForCheckNumber()
	{
		System.out.println("Check Number: ");
	}

	public static void transactionComplete(){
		System.out.println("Transaction complete");
	}

	public static void cashSelected()
	{
		askForAmount();
		Scanner sc = new Scanner(System.in);
		String cashAmt = sc.nextLine();

		if (cashAmt == null || cashAmt.isEmpty() || cashAmt.)
		{
			System.out.println("Error: Please enter a valid cash amount.");
			cashSelected();
		}
		if (cashAmt != null && cashAmt.compareTo(String.valueOf
				                                                (InvoiceDisplay
						                                                 .getTotal())) < 0)
		{
			payments.add(cashAmt);
			BigDecimal remainingTotal = InvoiceDisplay.getTotal().subtract(new
					                                                               BigDecimal(cashAmt));
			System.out.println(remainingTotal);
			if (remainingTotal.compareTo(BigDecimal.ZERO) > 0)
			{
				paymentOptions();
			}
			else
			{
				transactionComplete();
				System.exit(0);
			}
		}
	}

	public void checkSelected()
	{
		Scanner sc = new Scanner(System.in);
		askForRoutingNumber();
		String routingNum = sc.nextLine();

		if (routingNum == null || routingNum.isEmpty())
		{
			System.out.print("Error: Please enter a valid routing number.");
			checkSelected();
		}
		askForAccountNumber();
		String accountNum = sc.nextLine();
		askForCheckNumber();
		String checkNum = sc.nextLine();
		askForAmount();
		String cashAmt = sc.nextLine();

	}
}
