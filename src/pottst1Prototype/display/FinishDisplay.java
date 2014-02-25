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

public class FinishDisplay
{
	public static void paymentOptions()
	{
		System.out.println("Select a payment option: ");
		System.out.println("Cash");
		System.out.println("Credit");
		System.out.println("Check");
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
}
