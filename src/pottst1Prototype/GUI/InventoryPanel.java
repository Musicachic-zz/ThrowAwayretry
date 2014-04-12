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

public class InventoryPanel extends JPanel
{
	private static Product prod;
	private JTextField upc = new JTextField(8);
	private JTextField description = new JTextField(30);
	private JTextField price = new JTextField();
	private JTextField quantity = new JTextField();
	private JButton addInventory;
	private JButton removeInventory;
	private JFrame frame;
	private JLabel errorMessage = new JLabel("");


	public InventoryPanel(JFrame frame){

		this.frame = frame;

		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                             .getSize()));
		errorMessage.setForeground(Color.RED);

		JPanel upcPanel = new JPanel();
		upcPanel.setLayout(new FlowLayout());
		upcPanel.add(new JLabel("UPC"));
		upcPanel.add(upc);
		this.add(upc);


		JPanel descPanel = new JPanel();
		descPanel.setLayout(new FlowLayout());
		descPanel.add(new JLabel("Description"));
		descPanel.add(description);
		this.add(description);

		JPanel pricePanel = new JPanel();
		pricePanel.setLayout(new FlowLayout());
		pricePanel.add(new JLabel("Price"));
		pricePanel.add(price);
		this.add(price);

		JPanel qtyPanel = new JPanel();
		qtyPanel.setLayout(new FlowLayout());
		qtyPanel.add(new JLabel("Quantity"));
		qtyPanel.add(quantity);
		this.add(quantity);

		JPanel buttonPanel = new JPanel();
		JButton addInventory = new JButton("Add Inventory");
		addInventory.addActionListener(new AddEmployeeButtonListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(addInventory);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeInventory = new JButton("Remove Employee");
		removeInventory.addActionListener(new RemoveEmployeeButtonListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(removeInventory);
		this.add(buttonPanel);

	}

	public void displayError(String message) {
		errorMessage.setText(message);
	}

	public JFrame getFrame()
	{
		return frame;
	}
}
