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

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pottst1Prototype.data.Product;
import pottst1Prototype.display.InvoiceApp;

public class SalesOrderPanelListener implements ActionListener
{
	private JTextField add;
	private JTextField remove;
	private JTextField finish;
	private JTextField management;
	private JTextField exit;
	private DefaultListModel<Product> product;
	private JList<Product> invoice;
	private SalesOrderPanel salesView;

	//public SalesOrderPanel initialSalesDisplay;

	public SalesOrderPanelListener(JTextField add, JTextField remove, JTextField finish, JTextField management,
	                               JTextField exit, SalesOrderPanel salesView)
	{
		this.add = add;
		this.remove = remove;
		this.finish = finish;
		this.management = management;
		this.exit = exit;
		this.salesView= salesView;
	}

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

	private void add()
	{

		System.out.println("Add button clicked.");
		JFrame frame = salesView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new InvoicePanel());
		frame.revalidate();

	}

	private void remove(){
		System.out.println("Remove button clicked.");
	}

	private void finish(){
		System.out.println("Finish button clicked.");
	}

	private void management(){
		System.out.println("Management button clicked.");
	}

	private void exit(){
		System.out.println("Exit button clicked.");
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

