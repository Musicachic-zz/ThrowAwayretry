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

import pottst1Prototype.data.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * This class is the display of the invoice in a readable format. Inspired by
 * the display we did in class.
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
	public static void printInvoice(Map<Product, Integer> invoice)
	{

		System.out.println
				("+--------------------------------------------------------" +
				                   "-+");
		System.out.println("Item Desc." + "            |" + "Qty" + "    x   " +
				                   " " + "Price" + "    |" + "Subtotal");
		System.out.println
		("+---------------------------------------------------------+" );
		/*
		for (int i = 0; i < invoice.length; i++) {
			System.out.println(invoice[i]);
		}
		*/

		for (Map.Entry<Product, Integer> entry : invoice.entrySet())
		{
			Product product = entry.getKey();
			Integer quantity = entry.getValue();
			System.out.println(product.getDescription() + "    |" + quantity
			+"           " + product.getPrice());
			//System.out.println(p);
		}

		System.out.println
			("+---------------------------------------------------------+");
		System.out.println();
	}
}
