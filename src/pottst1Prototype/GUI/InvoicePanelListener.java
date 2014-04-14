/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/27/14
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
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains the listener for the invoice panel.
 */
public class InvoicePanelListener implements ActionListener
{
	public static Map<Product, Integer> invoiceDisplay = new HashMap<>();
	private static JTextField upcField;
	private static JTextField qtyField;
	private JButton addButton;
	private JButton removeButton;
	private static DefaultListModel<Product> product;
	private JList<Product> invoice;
	private static InvoicePanel invoiceView;
	private static String lastUpc = null;

	/**
	 * This method is the constructor for the InvoicePanelListener.
	 *
	 * @param invoice
	 * @param upcField
	 * @param qtyField
	 * @param invoiceView
	 * @param invoiceDisplay
	 */
	public InvoicePanelListener(JList<Product> invoice, JTextField upcField, JTextField qtyField,
	                            InvoicePanel invoiceView, Map invoiceDisplay)
	{
		this.upcField = upcField;
		this.qtyField = qtyField;
		this.invoice = invoice;
		this.invoiceView = invoiceView;
		this.product = (DefaultListModel<Product>) invoice.getModel();

	}

	/**
	 * This method is supposed to contain the code to add a item from the invoice.
	 *
	 * @param e
	 */
	public static void addProduct(ActionEvent e)
	{
		System.out.println("Add to invoice button clicked.");

		if (e.getSource() instanceof JButton)
		{
			JButton source = (JButton) e.getSource();

			if (upcField == null || upcField.getText().isEmpty())
			{
				if (lastUpc == null)
				{
					invoiceView.displayError("No UPC Provided.");

				}
				else
				{
					upcField.setText(lastUpc);
					invoiceView.displayError("UPC Defaulted to last UPC.");
				}
			}
			//Product pr = new Product();

			boolean isValid = false;

			for (Product p : ExtractProductsandInventory.prod)
			{
				//System.out.println(p);
				if (p.getUpc().equals(upcField.getText()))
				{
					isValid = true;
					lastUpc = upcField.getText();
					Integer quantity;
					String s = qtyField.getText();
					if (s == null || s.isEmpty())
					{
						//qtyField.setText(String.valueOf(1));
						quantity = 1;
					}
					else
					{
						quantity = Integer.valueOf(s);
						//qtyField.setText(qtyField.getText());
					}

					Integer invoiceQuantity = invoiceDisplay.get(p);
					if (invoiceQuantity != null)
					{
						quantity += invoiceDisplay.get(p);
						invoiceDisplay.put(p, p.getQuantity());
					}
					//source.setText("Adding...");
					//source.setEnabled(false);
					p.setUpc(upcField.getText());
					p.setQuantity(quantity);
					p.setPrice(p.getPrice());
					p.setDescription(p.getDescription());
					System.out.println(p);
					product.addElement(p);
					invoiceDisplay.put(p, p.getQuantity());

				}

			}
			if (!isValid)
			{
				invoiceView.displayError("UPC was not found.");
				source.setText("Add to Invoice");
				source.setEnabled(true);
			}

		}

	}

	/**
	 * This method is supposed to contain the code to remove a item from the invoice.
	 *
	 * @param e
	 */
	public static void removeProduct(ActionEvent e)
	{
		System.out.println("Remove from the invoice button clicked.");

		if (e.getSource() instanceof JButton)
		{
			JButton source = (JButton) e.getSource();

			if (upcField == null || upcField.getText().isEmpty())
			{

				invoiceView.displayError("No UPC Provided.");

			}
			else
			{
				upcField.setText(lastUpc);
				invoiceView.displayError("UPC Defaulted to last UPC.");
			}

			boolean isValid = false;

			for (Product p : ExtractProductsandInventory.prod)
			{

				if (p.getUpc().equals(upcField.getText()))
				{

					isValid = true;
					lastUpc = upcField.getText();
					Integer quantity;
					String s = qtyField.getText();
					if (s == null || s.isEmpty())
					{
						quantity = 1;
					}
					else
					{
						quantity = Integer.valueOf(s);
					}
					Integer invoiceQuantity = invoiceDisplay.get(p);
					if (invoiceQuantity != null)
					{
						quantity = invoiceDisplay.get(p) - quantity;
						invoiceDisplay.put(p, p.getQuantity());
					}

					p.setUpc(upcField.getText());
					p.setQuantity(quantity);
					p.setPrice(p.getPrice());
					p.setDescription(p.getDescription());
					System.out.println(p);
					product.removeElement(p);
					invoiceDisplay.put(p, p.getQuantity());

				}
			}
			if (!isValid)
			{
				invoiceView.displayError("UPC was not found.");
				source.setText("Remove from Invoice");
				source.setEnabled(true);
			}

		}
	}

	/**
	 * This is the method that does the work to go back to the sales menu.
	 */
	public static void backToMenu()
	{

		JFrame frame = invoiceView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Add to the Invoice, Remove from the Invoice,
	 * and Back buttons.
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
			case "Add":
				addProduct(e);
				break;
			case "Remove":
				removeProduct(e);
				break;
			case "Back":
				backToMenu();
				break;
		}
	}
}
