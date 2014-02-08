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

public class Product
{
	private String upc;
	private String description;
	private BigDecimal price;
	private int quantity;
	private int numInStock;

	public String getUpc()
	{
		return upc;
	}

	public void setUpc(String upc)
	{
		this.upc = upc;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getNumInStock()
	{
		return numInStock;
	}

	public void setNumInStock(int numInStock)
	{
		this.numInStock = numInStock;
	}

	@Override
	public String toString()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return "|" + description + "|" + nf.format(price) + " x " + quantity + " = " +
				       nf.format(price.multiply(BigDecimal.valueOf(quantity))) + "|";
	}
}
