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
	private JTextField amt = new JTextField();
	private JTextField routing = new JTextField();
	private JTextField accountNumber = new JTextField();
	private JTextField checkNumber = new JTextField();
	private JTextField ccNumber = new JTextField();
	private JTextField expDate = new JTextField();
	private FinishPanel finishView = this;
	private JLabel errorMessage = new JLabel("");
	private JLabel displayOk = new JLabel("");
	private JFrame frame;

	public FinishPanel(JFrame frame){

		this.frame = frame;
		this.payment = new DefaultListModel<>();
		paymentList = new JList<>(payment);
		paymentList.setLayout(new FlowLayout());
		this.add(paymentList);
		this.setLayout(new FlowLayout());
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
		amtPanel.setName("Amount");
		amtPanel.add(amt);
		this.add(amt);

		JPanel routingPanel = new JPanel();
		routingPanel.setLayout(new FlowLayout());
		routingPanel.add(new JLabel("Routing Number"));
		routingPanel.setName("Routing Number");
		routingPanel.add(routing);
		this.add(routing);

		JPanel accountPanel = new JPanel();
		accountPanel.setLayout(new FlowLayout());
		accountPanel.add(new JLabel("Account Number"));
		accountPanel.setName("Account Number");
		accountPanel.add(accountNumber);
		this.add(accountNumber);

		JPanel checkNoPanel = new JPanel();
		checkNoPanel.setLayout(new FlowLayout());
		checkNoPanel.add(new JLabel("Check Number"));
		checkNoPanel.setName("Check Number");
		checkNoPanel.add(checkNumber);
		this.add(checkNumber);

		JPanel ccNoPanel = new JPanel();
		ccNoPanel.setLayout(new FlowLayout());
		ccNoPanel.add(new JLabel("Credit Card "));
		ccNoPanel.setName("Credit Card");
		ccNoPanel.add(ccNumber);
		this.add(ccNumber);

		JPanel ccExpPanel = new JPanel();
		ccExpPanel.setLayout(new FlowLayout());
		ccExpPanel.add(new JLabel("Credit Card Expiration Date"));
		ccExpPanel.setName("Credit Card Expiration Date");
		ccExpPanel.add(expDate);
		this.add(expDate);

		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("Add Payment");
		addButton.addActionListener(new FinishPanelListener());
		addButton.setName("Add Payment");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(addButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeButton = new JButton("Remove Payment");
		removeButton.addActionListener(new FinishPanelListener());
		removeButton.setName("Remove Payment");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(removeButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton backButton = new JButton("Back to Previous Menu");
		backButton.addActionListener(new FinishPanelListener());
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
