/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/25/14
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
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains the listener for the sales order panel.
 */
public class SalesOrderPanelListener implements ActionListener
{
	public static Map<Product, Integer> invoiceDisplay = new HashMap<>();
	private JTextField add;
	private JTextField remove;
	private JTextField finish;
	private JTextField management;
	private JTextField exit;
	private DefaultListModel<Product> product;
	private JList<Product> invoice;
	private SalesOrderPanel salesView;

	//public SalesOrderPanel initialSalesDisplay;

	/**
	 * This method is the constructor for the SalesOrderPanelListener.
	 *
	 * @param add
	 * @param remove
	 * @param finish
	 * @param management
	 * @param exit
	 * @param salesView
	 * @param invoiceDisplay
	 */
	public SalesOrderPanelListener(JTextField add, JTextField remove, JTextField finish, JTextField management,
	                               JTextField exit, SalesOrderPanel salesView, Map invoiceDisplay)
	{
		this.add = add;
		this.remove = remove;
		this.finish = finish;
		this.management = management;
		this.exit = exit;
		this.salesView = salesView;
		this.invoiceDisplay = invoiceDisplay;
	}

	/**
	 * This method routes you to go add items to the invoice.
	 */
	private void add()
	{

		System.out.println("Add button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new InvoicePanel(frame));
		frame.revalidate();

	}

	/**
	 * This method routes you to go remove items from the invoice.
	 */
	private void remove()
	{
		System.out.println("Remove button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new InvoicePanel(frame));
		frame.revalidate();
	}

	/**
	 * This method routes you to go to make payments.
	 */
	private void finish()
	{
		System.out.println("Finish button clicked.");
		System.out.println("Finish button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new FinishPanel(frame));
		frame.revalidate();
	}

	/**
	 * This method routes you to the management menu.
	 */
	private void management()
	{
		System.out.println("Management button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new ManagementPanel(frame));
		frame.revalidate();
	}

	/**
	 * This method routes you back to the original login screen.
	 */
	private void exit()
	{
		System.out.println("Exit button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new LoginPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Add, Remove, Finish, Management,
	 * and Exit buttons.
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
				add();
				break;
			case "Remove":
				remove();
				break;
			case "Finish":
				finish();
				break;
			case "Management":
				management();
				break;
			case "Exit":
				exit();
				break;

		}
	}

/*		if(add.getText().equals(this)){
			source.setText("Please wait...");
			source.setEnabled(false);
			initialSalesDisplay.displayError("Successful");
		}

		else if (e.getSource() instanceof JButton){
			//source = (JButton) e.getSource();

			source.setText("Please wait...");
			source.setEnabled(false);
		}*/
}

