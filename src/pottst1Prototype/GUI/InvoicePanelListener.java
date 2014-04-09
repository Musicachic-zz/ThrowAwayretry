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
import pottst1Prototype.GUI.InvoicePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvoicePanelListener implements ActionListener
{
	private static JTextField upcField;
	private static JTextField qtyField;
	private JButton addButton;
	private JButton removeButton;
	private static DefaultListModel<Product> product;
	private JList<Product> invoice;
	private static InvoicePanel invoiceView;
	private static JTextField lastUpc = null;

	public InvoicePanelListener(JList<Product> invoice, JTextField upcField, JTextField qtyField,
	                            InvoicePanel invoiceView)
	{
		this.upcField = upcField;
		this.qtyField = qtyField;
		this.invoice = invoice;
		this.invoiceView = invoiceView;
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
					upcField = lastUpc;
					invoiceView.displayError("UPC Defaulted to last UPC.");
				}
			}
			Product pr = new Product();

			for (Product p : ExtractProductsandInventory.prod)
			{
				if (p.getUpc().equals(upcField))
				{
					lastUpc = upcField;

					String s = String.valueOf(qtyField);
					if (s == null && s.isEmpty())
					{
						s = String.valueOf(1);
					}
					else
					{
						s = String.valueOf(qtyField);
					}

					source.setText("Adding...");
					source.setEnabled(false);
					pr.setUpc(upcField.getText());
					pr.setQuantity(Integer.parseInt(qtyField.getText()));

					product.addElement(pr);

				}
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
		}
	}
}
