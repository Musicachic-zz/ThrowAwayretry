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

import pottst1Prototype.data.Product;

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
	private InvoicePanel invoiceView;

	public InvoicePanelListener(JList<Product> invoice, JTextField upcField, JTextField qtyField, InvoicePanel invoiceView){
		this.upcField = upcField;
		this.qtyField = qtyField;
		this.invoice = invoice;
		this.invoiceView = invoiceView;
	}

	public static void addProduct(){
	Product p = new Product();
	p.setUpc(upcField.getText());
	p.setQuantity(Integer.parseInt(qtyField.getText()));

	product.addElement(p);
}

	public static void removeProduct(){
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
				addProduct();
				break;
			case "Remove":
				removeProduct();
				break;
		}
	}
}
