package pottst1Prototype.display;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/7/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import pottst1Prototype.data.Product;

import java.util.ArrayList;

/**
 * This class is the display of the invoice in a readable format.
 */
public class InvoiceDisplay
{
	/**
	 * This method displays all the items that were entered while using the
	 * InvoiceApp class.
	 *
	 * @param invoice This is the invoice that already has the arrayList of
	 *                items.
	 */
	public static void printInvoice(ArrayList<Product> invoice)
	{
		System.out.println("+----------------------------------+");

		/*
		for (int i = 0; i < invoice.length; i++) {
			System.out.println(invoice[i]);
		}
		*/

		for (Product p : InvoiceApp.invoice)
		{
			System.out.println(p);
		}

		System.out.println("+----------------------------------+");
		System.out.println();
	}
}
