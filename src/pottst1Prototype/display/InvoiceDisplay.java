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

public class InvoiceDisplay
{
	public static void printInvoice(ArrayList<Product> invoice)
	{
		System.out.println("+----------------------------------+");

		/*
		for (int i = 0; i < invoice.length; i++) {
			System.out.println(invoice[i]);
		}
		*/

		for (Product p: invoice) {
			System.out.println(p.toString());
		}

		System.out.println("+----------------------------------+");
		System.out.println();
	}
}
