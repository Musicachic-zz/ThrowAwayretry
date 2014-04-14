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

import pottst1Prototype.data.Product;

import javax.swing.*;
import java.awt.*;

/**
 * This class contains the code to display the Inventory panel.
 */
public class InventoryPanel extends JPanel
{
	private static Product prod;
	private JTextField upc = new JTextField(8);
	private JTextField description = new JTextField(30);
	private JTextField price = new JTextField(10);
	private JTextField quantity = new JTextField(3);
	private JButton addInventory;
	private JButton removeInventory;
	private InventoryPanel inventoryView = this;
	private JFrame frame;
	private JLabel errorMessage = new JLabel("");
	private JLabel displayOk = new JLabel("");

	/**
	 * This method contains the objects to create the inventory panel.
	 *
	 * @param frame
	 */
	public InventoryPanel(JFrame frame)
	{

		this.frame = frame;
		this.prod = new Product();

		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                             .getSize()));
		errorMessage.setForeground(Color.RED);

		font = displayOk.getFont();
		displayOk.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                          .getSize()));
		displayOk.setForeground(Color.BLUE);

		JPanel upcPanel = new JPanel();
		upcPanel.setLayout(new FlowLayout());
		upcPanel.add(new JLabel("UPC"));
		upcPanel.add(upc);
		this.add(upcPanel);

		JPanel descPanel = new JPanel();
		descPanel.setLayout(new FlowLayout());
		descPanel.add(new JLabel("Description"));
		descPanel.add(description);
		this.add(descPanel);

		JPanel pricePanel = new JPanel();
		pricePanel.setLayout(new FlowLayout());
		pricePanel.add(new JLabel("Price"));
		pricePanel.add(price);
		this.add(pricePanel);

		JPanel qtyPanel = new JPanel();
		qtyPanel.setLayout(new FlowLayout());
		qtyPanel.add(new JLabel("Quantity"));
		qtyPanel.add(quantity);
		this.add(qtyPanel);

		JPanel buttonPanel = new JPanel();
		JButton addInventory = new JButton("Add Inventory");
		addInventory.addActionListener(new InventoryPanelListener(inventoryView, upc, description,
		                                                          price, quantity));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(addInventory);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeInventory = new JButton("Remove Inventory");
		removeInventory.addActionListener(new InventoryPanelListener(inventoryView, upc, description,
		                                                             price, quantity));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(removeInventory);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton backButton = new JButton("Back to Previous Menu");
		backButton.addActionListener(new InventoryPanelListener(inventoryView, upc, description,
		                                                        price, quantity));
		backButton.setName("Back");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(backButton);
		this.add(buttonPanel);

	}

	/**
	 * This is a generic error message method that is used to display errors on each page.
	 *
	 * @param message
	 */
	public void displayError(String message)
	{
		errorMessage.setText(message);
	}

	/**
	 * This is a generic message method that is used to display when something is processed on some pages.
	 *
	 * @param message
	 */
	public void displayOk(String message)
	{
		displayOk.setText(message);
	}

	/**
	 * This is a generic method to help transition between frames.
	 *
	 * @return JFrame
	 */
	public JFrame getFrame()
	{
		return frame;
	}
}
