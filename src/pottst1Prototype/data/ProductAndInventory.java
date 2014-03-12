/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/11/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ProductAndInventory
{
	private static Scanner sc = new Scanner(System.in);
	private static Product prod;
	static File f;

	public static void addNewProduct()
	{
		File f = new File("ProductsAndInventory.txt");

		if (!f.exists())
		{
			try
			{
				f.createNewFile();
			} catch (IOException e)
			{
				System.out.println("Could not create file.");
				System.exit(-1);
			}
		}

		PrintWriter pw = null;

		try
		{
			pw = new PrintWriter(new FileOutputStream(f, true));
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not locate file.");
		}

		String choice = "y";

		if (pw != null)
		{
			while (choice.equalsIgnoreCase("y"))
			{
				System.out.print("What is the upc? ");
				String upc = sc.nextLine();

				System.out.print("What is the product description? ");
				String description = sc.nextLine();

				System.out.print("What is the product price per unit? ");
				BigDecimal price = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));

				System.out.print("What is the number in stock of the product? ");
				int quantity = Integer.parseInt(sc.nextLine());

				Product prod = new Product(upc, description, price, quantity);

				pw.write(prod.getUpc() + "\t");
				pw.write(prod.getDescription() + "\t");
				pw.write(String.valueOf(prod.getPrice()) + "\t");
				pw.write(prod.getQuantity() + "\n");

				System.out.print("Would you like to add another product? Y or N ");
				choice = sc.nextLine();
			}
			pw.close();

		}

		Scanner sc = null;

		try
		{
			sc = new Scanner(f);
		}
		catch(FileNotFoundException e){
			System.out.println("Could not open file.");
		}

		while (sc.hasNextLine())
		{
			String in = sc.nextLine();
			System.out.println(in);
			String[] fields = in.split("\t");
			System.out.println("UPC: " + fields[0]);
			System.out.println("Description: " + fields[1]);
			System.out.println("Price:  $" + fields[2]);
			System.out.println("# in Stock " + fields[3]);
		}
	}
}
