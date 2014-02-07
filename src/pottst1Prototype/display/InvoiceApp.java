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

public class InvoiceApp
{
	public static ArrayList<Product> invoice = new ArrayList<>();
	private static int invoiceSize = 0;

	public static void invoiceEntry()
	{

	}

	public static void addDisplay()
	{

		boolean isValid = true;

		while (!isValid)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a UPC code: ");
			String upc = sc.nextLine();

			for (Product p : ProductList.getProducts())
			{
				if (p.getUpc().equals(upc))
				{
					isValid = true;
					//invoiceEntry();
					invoice.add(p);
				}
				else
				{
					System.out.println("Error! The UPC code was not found.");
				}

			}

		}
	}

	public BigDecimal getInvoiceTotal()
	{

		BigDecimal invoiceTotal = new BigDecimal(0);
		for (Product lineItem : invoice)
		{
			invoiceTotal.add(lineItem.getPrice());
		}
		return invoiceTotal;
	}

	public String getFormattedTotal(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getInvoiceTotal());
	}

}
