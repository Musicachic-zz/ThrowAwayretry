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

public class ProductList extends Product
{
	public static Product[] products;

	public ProductList()
	{

	}

	public static Product[] getProducts()
	{
		products[0].setUpc("12345678");
		products[0].setDescription("Street Fighter 2 ");
		products[0].setPrice(new BigDecimal(20.00));
		products[0].setQuantity(20);
		products[1].setUpc("87654321");
		products[1].setDescription("Street Fighter 3 ");
		products[1].setPrice(new BigDecimal(30.00));
		products[1].setQuantity(20);
		products[2].setUpc("11111111");
		products[2].setDescription("Street Fighter IV ");
		products[2].setPrice(new BigDecimal(40.00));
		products[2].setQuantity(20);
		products[3].setUpc("222222222");
		products[3].setDescription("Marvel vs Capcom 3 ");
		products[3].setPrice(new BigDecimal(50.00));
		products[3].setQuantity(20);

		return products;
	}
}
