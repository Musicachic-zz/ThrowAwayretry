/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/13/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.GUI;

import pottst1Prototype.data.Payment;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This class contains the listener for the finish panel.
 */
public class FinishPanelListener implements ActionListener
{
	private JTextField amt;
	private JTextField routing;
	private JTextField accountNumber;
	private JTextField checkNumber;
	private JTextField ccNumber;
	private JTextField expDate;
	public static ArrayList<Payment> paymentDisplay = new ArrayList<>();
	private static FinishPanel finishView;
	private static DefaultListModel<Payment> payment;
	private JList<Payment> paymentList;

	/**
	 * This method is the constructor for the FinishPanelListener.
	 *
	 * @param paymentList
	 * @param amt
	 * @param routing
	 * @param accountNumber
	 * @param checkNumber
	 * @param ccNumber
	 * @param expDate
	 * @param finishView
	 */
	public FinishPanelListener(JList<Payment> paymentList, JTextField amt, JTextField routing,
	                           JTextField accountNumber,
	                           JTextField checkNumber, JTextField ccNumber, JTextField expDate, FinishPanel finishView)
	{

		this.paymentList = paymentList;
		this.amt = amt;
		this.routing = routing;
		this.accountNumber = accountNumber;
		this.checkNumber = checkNumber;
		this.ccNumber = ccNumber;
		this.expDate = expDate;
		this.finishView = finishView;

	}

	/**
	 * This method is supposed to contain the code to add a payment.
	 *
	 * @param e
	 */
	public static void addPayment(ActionEvent e)
	{

	}

	/**
	 * This method is supposed to contain the code to remove a payment.
	 *
	 * @param e
	 */
	public static void removePayment(ActionEvent e)
	{

	}

	/**
	 * This is the method that does the work to go back to the sales menu.
	 */
	public static void backToMenu()
	{

		JFrame frame = finishView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Add Payment, Remove Payment, and Back buttons.
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
				addPayment(e);
				break;
			case "Remove":
				removePayment(e);
				break;
			case "Back":
				backToMenu();
				break;
		}
	}
}
