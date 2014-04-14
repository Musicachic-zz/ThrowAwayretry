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
import java.awt.*;

public class FinishPanel extends JPanel
{
	private DefaultListModel<Payment> payment;
	private JList<Payment> paymentList;
	private JTextField amt = new JTextField(8);
	private JTextField routing = new JTextField(8);
	private JTextField accountNumber = new JTextField(12);
	private JTextField checkNumber = new JTextField(5);
	private JTextField ccNumber = new JTextField(16);
	private JTextField expDate = new JTextField(7);
	private FinishPanel finishView = this;
	private JLabel errorMessage = new JLabel("");
	private JLabel displayOk = new JLabel("");
	private JFrame frame;

	public FinishPanel(JFrame frame){

		super(new GridLayout(7, 3));
		this.frame = frame;
		this.payment = new DefaultListModel<>();
		paymentList = new JList<>(payment);
		paymentList.setLayout(new FlowLayout());
		this.add(paymentList);

		this.add(errorMessage);
		//this.setLayout(new FlowLayout());
		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
		errorMessage.setForeground(Color.RED);
		font = displayOk.getFont();
		displayOk.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                          .getSize()));
		displayOk.setForeground(Color.BLUE);

		JPanel amtPanel = new JPanel();
		amtPanel.setLayout(new FlowLayout());
		amtPanel.add(new JLabel("Amount"));
		//amtPanel.setName("Amount");
		amtPanel.add(amt);
		this.add(amtPanel);

		JPanel routingPanel = new JPanel();
		routingPanel.setLayout(new FlowLayout());
		routingPanel.add(new JLabel("Routing Number"));
		//routingPanel.setName("Routing Number");
		routingPanel.add(routing);
		this.add(routingPanel);

		JPanel accountPanel = new JPanel();
		accountPanel.setLayout(new FlowLayout());
		accountPanel.add(new JLabel("Account Number"));
		//accountPanel.setName("Account Number");
		accountPanel.add(accountNumber);
		this.add(accountPanel);

		JPanel checkNoPanel = new JPanel();
		checkNoPanel.setLayout(new FlowLayout());
		checkNoPanel.add(new JLabel("Check Number"));
		//checkNoPanel.setName("Check Number");
		checkNoPanel.add(checkNumber);
		this.add(checkNoPanel);

		JPanel ccNoPanel = new JPanel();
		ccNoPanel.setLayout(new FlowLayout());
		ccNoPanel.add(new JLabel("Credit Card "));
		//ccNoPanel.setName("Credit Card");
		ccNoPanel.add(ccNumber);
		this.add(ccNoPanel);

		JPanel ccExpPanel = new JPanel();
		ccExpPanel.setLayout(new FlowLayout());
		ccExpPanel.add(new JLabel("Credit Card Expiration Date"));
		//ccExpPanel.setName("Credit Card Expiration Date");
		ccExpPanel.add(expDate);
		this.add(ccExpPanel);

		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("Add Payment");
		addButton.addActionListener(new FinishPanelListener(paymentList, amt, routing, accountNumber,
		                                                    checkNumber,ccNumber, expDate, finishView));
		addButton.setName("Add Payment");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(addButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeButton = new JButton("Remove Payment");
		removeButton.addActionListener(new FinishPanelListener(paymentList, amt, routing, accountNumber,
		                                                       checkNumber,ccNumber, expDate, finishView));
		removeButton.setName("Remove Payment");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(removeButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton backButton = new JButton("Back to Previous Menu");
		backButton.addActionListener(new FinishPanelListener(paymentList, amt, routing, accountNumber,
		                                                     checkNumber,ccNumber, expDate, finishView));
		backButton.setName("Back");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(backButton);
		this.add(buttonPanel);

	}

	public void displayError(String message)
	{
		errorMessage.setText(message);
	}

	public void displayOk(String message)
	{
		displayOk.setText(message);
	}

	public JFrame getFrame()
	{
		return frame;
	}
}
