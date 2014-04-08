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
	private JTextField upcField;
	private JTextField qtyField;
	private JButton addButton;
	private JButton removeButton;
	private DefaultListModel<Product> product;
	private JList<Product> invoice;

	public InvoicePanelListener(JList<Product> invoice, JTextField upcField, JTextField qtyField){
		this.upcField=upcField;
		this.qtyField=qtyField;
		this.invoice=invoice;
	}

	private void addProduct(){
		Product p = new Product();
		p.setUpc(upcField.getText());
		p.setQuantity(Integer.parseInt(qtyField.getText()));

		product.addElement(p);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");

		if(e.getSource() instanceof JButton){
			JButton source = (JButton) e.getSource();

			source.setText("Please wait...");
			source.setEnabled(false);
		}
	}
}
