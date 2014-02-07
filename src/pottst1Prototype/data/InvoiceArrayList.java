package pottst1Prototype.data;

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import pottst1Prototype.data.Product;



public class InvoiceArrayList
{
	private ArrayList<Product> lineItems = new ArrayList<>();

/*	public InvoiceArrayList(){
		lineItems = new ArrayList<>();
	}*/

	public void addItem (Product lineItem){
		this.lineItems.add(lineItem);

	}

	public ArrayList<Product> getLineItems(){
		return lineItems;
	}

	public void removeItem (Product lineItem){
		this.lineItems.remove(lineItem);
	}

	public BigDecimal getInvoiceTotal(){

		BigDecimal invoiceTotal = new BigDecimal(0);
		for (Product lineItem : this.lineItems){
			invoiceTotal.add(lineItem.getPrice());
		}
		return invoiceTotal;
	}

	public String getFormattedTotal(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getInvoiceTotal());
	}
}
