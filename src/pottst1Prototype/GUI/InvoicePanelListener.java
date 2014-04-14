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

	public InvoicePanelListener(JList<Product> invoice, JTextField upcField, JTextField qtyField,
	                            InvoicePanel invoiceView, Map invoiceDisplay)
	{
		this.upcField = upcField;
		this.qtyField = qtyField;
		this.invoice = invoice;
		this.invoiceView = invoiceView;
		this.product = (DefaultListModel<Product>) invoice.getModel();

	}

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

	public static void removeProduct()
	{
		Product p = new Product();
		p.setUpc(upcField.getText());
		p.setQuantity(Integer.parseInt(qtyField.getText()));

		product.removeElement(p);
	}

	public static void backToMenu()
	{

		JFrame frame = invoiceView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}

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
				removeProduct();
				break;
			case "Back":
				backToMenu();
				break;
		}
	}
}
