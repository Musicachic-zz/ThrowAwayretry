package pottst1Prototype.display;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import pottst1Prototype.data.Product;
import pottst1Prototype.data.ProductList;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import pottst1Prototype.display.InvoiceDisplay;

/**
 * This is the class that creates the invoice array list. It validates that
 * the UPC entered is in the ProductList class and then prompts for the amount
 * desired. Utimately it should also take the quantity based on what is
 * available.
 */
public class InvoiceApp
{
	public static ArrayList<Product> invoice = new ArrayList<>();
	private static int invoiceSize = 0;
	public int quantityPurchased = 0;

	/**
	 * This method is used to add products to the invoice arrayList. It
	 * checks to see if the UPC exists in the ProductList and if does adds it
	 * to the arrayList.
	 */
	public static void addDisplay()
	{

		boolean isValid = false;
		String choice = "y";

		while (!isValid)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a UPC code: ");
			String upc = sc.nextLine();
			//Product p = new Product();

			for (Product p : ProductList.getProducts())
			{
				if (p.getUpc().equals(upc))
				{
					askForQuantity();
					int quantity = sc.nextInt();
					p.setQuantity(quantity);
					invoice.add(p);
					InvoiceDisplay.printInvoice(invoice);
					//System.out.println(invoice);
					//invoiceSize++;
					InitialSalesDisplay.initialDisplay();
				}

			}
			System.out.println("Error! The UPC code was not found.");
			addDisplay();
		}

		InvoiceDisplay.printInvoice(invoice);

	}

	/**
	 * This method as the user how many of a product a customer will be
	 * purchasing.
	 */
	public static void askForQuantity()
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity for purchase: ");
	}

	/**
	 * This is the getter for the invoice total based on all the items added
	 * or removed from the invoice.
	 *
	 * @return invoiceTotal This is the total price of all products on the
	 *         invoice.
	 */
	public BigDecimal getInvoiceTotal()
	{

		BigDecimal invoiceTotal = new BigDecimal(0);
		for (Product lineItem : invoice)
		{
			invoiceTotal.add(lineItem.getPrice());
		}
		return invoiceTotal;
	}

	/**
	 * This formats the invoice total to currency format for readability.
	 *
	 * @return getInvoiceTotal in a readable currency format.
	 */
	public String getFormattedTotal()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getInvoiceTotal());
	}

}



