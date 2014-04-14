/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/11/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.GUI;

import pottst1Prototype.data.ExtractProductsandInventory;
import pottst1Prototype.data.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * This class contains the listener for the finish panel.
 */
public class InventoryPanelListener implements ActionListener
{
	private static Product prod;
	private static DefaultListModel<Product> product;
	private JTextField upc;
	private JTextField description;
	private JTextField price;
	private JTextField quantity;
	private JButton addInventory;
	private JButton removeInventory;
	private static InventoryPanel inventoryView;
	public static PrintWriter pw = null;

	/**
	 * This method is the constructor for the InventoryPanelListener.
	 *
	 * @param inventoryView
	 * @param upc
	 * @param description
	 * @param price
	 * @param quantity
	 */

	public InventoryPanelListener(InventoryPanel inventoryView, JTextField upc, JTextField description,
	                              JTextField price, JTextField quantity)
	{
		this.inventoryView = inventoryView;
		this.upc = upc;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * This method is supposed to contain the code to add to the inventory.
	 *
	 * @param e
	 */
	private void add(ActionEvent e)
	{

		System.out.println("Add inventory button clicked");

		if (e.getSource() instanceof JButton)
		{

			JButton source = (JButton) e.getSource();

			File f = new File("ProductsAndInventory.txt");

			try
			{
				PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));

				upc.getText();
				description.getText();
				price.getText();
				quantity.getText();

				//prod = new Product(upc, description, price, quantity);

				for (Product p : ExtractProductsandInventory.prod)
				{

					pw.write(prod.getUpc() + "\t");
					pw.write(prod.getDescription() + "\t");
					pw.write(String.valueOf(prod.getPrice()) + "\t");
					pw.write(prod.getQuantity() + "\n");
				}

			}
			catch (FileNotFoundException a)
			{
				a.printStackTrace();
			}
		}

	}

	/**
	 * This method is supposed to contain the code to remove a item from the inventory.
	 *
	 * @param e
	 */
	private void remove(ActionEvent e)
	{

	}

	/**
	 * This is the method that does the work to go back to the sales menu.
	 */
	public static void backToMenu()
	{

		JFrame frame = inventoryView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new ManagementPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Add Inventory, Remove Inventory, and Back buttons.
	 *
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");

		JButton source = (JButton) e.getSource();

		switch (source.getName())
		{
			case "Add Inventory":
				add(e);
				break;
			case "Remove Inventory":
				remove(e);
				break;
			case "Back":
				backToMenu();
				break;

		}
	}
}
