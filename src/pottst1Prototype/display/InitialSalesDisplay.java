/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.display;

import java.util.Scanner;

/**
 * This class shows the initial sales display options and asks do you want to
 * add, remove, or exit. Based on their selection it takes them to classes
 * that will provide that option.
 */

public class InitialSalesDisplay
{
	/**
	 * This method has code for the initial questions asked in the sales
	 * display. It will route to the next method to complete that action
	 * based on their choice.
	 */

	public static void initialDisplay()
	{
		//Inventory inventory = new Inventory();
		//Invoice invoice = new Invoice();

		System.out.print("Would you like to do: Add, Remove, or Exit?: ");

		Scanner sc = new Scanner(System.in);
		String salesDisplayChoice = sc.next();

		if (salesDisplayChoice.equalsIgnoreCase("Add"))
		{
			System.out.println("You selected Add");
			InvoiceApp.addDisplay();
			//invoice.addProduct(product, quantity)
		}
		if (salesDisplayChoice.equalsIgnoreCase("Remove"))
		{
			System.out.println("You selected Remove");
			InvoiceApp.removeDisplay();
		}
		if (salesDisplayChoice.equalsIgnoreCase("Exit"))
		{
			System.out.println("You selected Exit.");
			System.out.println("Goodbye.");
			System.exit(0);
		}
		else {
			System.out.println("Please enter a valid option.");
			initialDisplay();
		}
	}
}
