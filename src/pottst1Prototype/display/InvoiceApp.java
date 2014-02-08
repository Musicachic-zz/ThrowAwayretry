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

public class InvoiceApp
{
	public static ArrayList<Product> invoice = new ArrayList<>();
	private static int invoiceSize = 0;
	public int quantityPurchased = 0;

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

	public static void askForQuantity(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity for purchase: ");
	}

/*	public BigDecimal getInvoiceTotal()
	{

		BigDecimal invoiceTotal = new BigDecimal(0);
		for (Product lineItem : invoice)
		{
			invoiceTotal.add(lineItem.getPrice());
		}
		return invoiceTotal;
	}

	public String getFormattedTotal()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getInvoiceTotal());
	}*/

}



