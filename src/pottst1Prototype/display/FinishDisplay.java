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

import pottst1Prototype.display.InitialSalesDisplay;

import static pottst1Prototype.display.InitialSalesDisplay.newScanner;

/**
 * This class has the display for finishing the processing on a invoice
 * transaction and allowing a customer to pay for their products purchased.
 *
 * @author Z. Hoffman + modifications by T. Potts
 */

public class FinishDisplay
{

	private static List<String> payments = new ArrayList<>();
	private static BigDecimal remainingTotal = BigDecimal.valueOf(0);
	private static Scanner sc = new Scanner(System.in);
	//sc = new Scanner(System.in);

	public static void paymentOptions()
	{
		System.out.print("Select a payment option: Cash, Credit, or Check: ");
		String paymentDisplayChoice = sc.nextLine();

		switch (paymentDisplayChoice.toUpperCase())
		{
			case "CASH":
				System.out.println("You selected Cash");
				cashSelected();
				break;
			case "CREDIT":
				System.out.println("You selected Credit");
				break;
			case "CHECK":
				System.out.println("You selected Check");
				checkSelected();
				break;
			default:
				System.out.println("Please enter valid payment option.");
				paymentOptions();
				break;
		}

/*		if (paymentDisplayChoice.equalsIgnoreCase("Cash"))
		{
			System.out.println("You selected Cash");
			cashSelected();
		}

		else if (paymentDisplayChoice.equalsIgnoreCase("Credit"))
		{
			System.out.println("You selected Credit");

		}

		else if (paymentDisplayChoice.equalsIgnoreCase("Check"))
		{
			System.out.println("You selected Check");

		}
		else
		{
			System.out.println("Please enter valid payment option.");
			paymentOptions();
		}*/

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

	public static void askForAccountNumber()
	{
		System.out.print("Account Number: ");
	}

	public static void askForRoutingNumber()
	{
		System.out.print("Routing Number: ");
	}

	public static void askForCheckNumber()
	{
		System.out.print("Check Number: ");
	}

	public static void transactionComplete()
	{
		System.out.println("Transaction complete");
	}

	public static void cashSelected()
	{
		askForAmount();
		String s = sc.nextLine();
		BigDecimal cashAmt;
		cashAmt = BigDecimal.valueOf(Double.parseDouble(s));

		if (payments == null || payments.isEmpty())
		{

			if (s == null || s.isEmpty())
			{
				System.out.println("Error: Please enter a valid cash amount.");
				cashSelected();
			}
			//cashAmt = BigDecimal.valueOf(Double.parseDouble(s));
			if (cashAmt.compareTo(InvoiceDisplay.getTotal()) < 0)
			{
				payments.add(s);

				remainingTotal = InvoiceDisplay.getTotal().subtract(cashAmt);
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
		else // (payments != null || !payments.isEmpty())
		{
			//cashAmt = BigDecimal.valueOf(Double.parseDouble(s));
			if (s == null || s.isEmpty())
			{
				System.out.println("Error: Please enter a valid cash amount.");
				cashSelected();
			}

			else if (cashAmt.compareTo(remainingTotal) <= 0)
			{
				payments.add(s);
				remainingTotal = remainingTotal.subtract(cashAmt);
				System.out.println(remainingTotal);
				if (remainingTotal.compareTo(BigDecimal.ZERO) > 0)
				{
					paymentOptions();
					System.out.println(remainingTotal);

				}
				else
				{
					transactionComplete();
					System.exit(0);
				}
			}

		}
	}

	public static void checkSelected()
	{
		askForRoutingNumber();
		String t = sc.nextLine();
		Long routingNum;


		try {
			routingNum = Long.parseLong(t);
			System.out.println("Routing Number: " + routingNum);
		}
		catch (NumberFormatException nfe){
			System.out.println("Error: Please enter a valid routing number.");
			checkSelected();
	}

		askForAccountNumber();
		String u = sc.nextLine();
		Long accountNum;

		try {
			accountNum = Long.parseLong(u);
			System.out.println("Account Number: " + accountNum);
		}
		catch (NumberFormatException nfe){
			System.out.println("Error: Please enter a valid routing number.");
			checkSelected();
		}

		askForCheckNumber();
		String v = sc.nextLine();
		Integer checkNum;


		try{
			checkNum = Integer.parseInt(v);
			System.out.println("Check Number: " + checkNum);
		}
		catch(NumberFormatException nfe){
			System.out.print("Error: Please enter a valid check number.");
			checkSelected();
		}

		askForAmount();
		String s = sc.nextLine();
		BigDecimal checkAmt;
		checkAmt = BigDecimal.valueOf(Double.parseDouble(s));
		if (payments == null || payments.isEmpty())
		{
			if (s == null || s.isEmpty())
			{
				System.out.println("Error: Please enter a valid check payment amount.");
				checkSelected();
			}
			if (checkAmt.compareTo(InvoiceDisplay.getTotal()) < 0)
			{
				payments.add(s);

				remainingTotal = InvoiceDisplay.getTotal().subtract(checkAmt);
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
		else // (payments != null || !payments.isEmpty())
		{
			//cashAmt = BigDecimal.valueOf(Double.parseDouble(s));
			if (s == null || s.isEmpty())
			{
				System.out.println("Error: Please enter a valid cash amount.");
				checkSelected();
			}

			else if (checkAmt.compareTo(remainingTotal) <= 0)
			{
				payments.add(s);
				remainingTotal = remainingTotal.subtract(checkAmt);
				System.out.println(remainingTotal);
				if (remainingTotal.compareTo(BigDecimal.ZERO) > 0)
				{
					paymentOptions();
					System.out.println(remainingTotal);

				}
				else
				{
					transactionComplete();
					System.exit(0);
				}
			}
		}
	}
}
