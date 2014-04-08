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
import java.awt.*;

public class InvoicePanel extends JPanel
{
	private JTextField add;
	private JTextField remove;
	private JTextField finish;
	private JTextField management;
	private JTextField exit;
	private DefaultListModel<Product> product;
	private JList<Product> invoice;

	public InvoicePanel(){

		this.setLayout(new GridLayout(2, 2));

		JTextField upcField = new JTextField();
		upcField.setColumns(8);

		JPanel upcPanel = new JPanel();
		upcPanel.setLayout(new FlowLayout());
		upcPanel.add(new JLabel("UPC"));
		upcPanel.setName("UPC");
		upcPanel.add(upcField);
		this.add(upcPanel);

		JTextField qtyField = new JTextField();
		qtyField.setColumns(3);

		JPanel qtyPanel = new JPanel();
		qtyPanel.setLayout(new FlowLayout());
		qtyPanel.add(new JLabel("Quantity"));
		qtyPanel.setName("Quantity");
		qtyPanel.add(qtyField);
		this.add(qtyPanel);

		//Add button section
		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("Add to Invoice");
		addButton.addActionListener(new SalesOrderPanelListener(add, remove, finish,management, exit));
		addButton.setName("Add");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(addButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeButton = new JButton("Remove from Invoice");
		removeButton.addActionListener(new SalesOrderPanelListener(add,remove, finish, management, exit));
		removeButton.setName("Remove");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(removeButton);
		this.add(buttonPanel);
	}

	private JPanel buildListPanel() {

		invoice.setPreferredSize(new Dimension(300, 380));

		JPanel listPanel =
				new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		listPanel.add(invoice);

		return listPanel;
	}
}
