/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/11/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.GUI;

import javax.swing.*;
import java.awt.*;

public class ManagementPanel extends JPanel
{
	private JFrame frame;
	private JLabel errorMessage = new JLabel("");
	private JButton employeeButton;
	private JButton inventoryButton;

	public ManagementPanel(JFrame frame){
		super(new GridLayout(7, 3));
		this.frame = frame;
		this.add(new JPanel());

		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
		errorMessage.setForeground(Color.RED);

		//Employee Button Stuff
		JPanel buttonPanel = new JPanel();
		JButton employeeButton = new JButton("Employee Management");
		employeeButton.addActionListener(new ManagementPanelListener(employeeButton,inventoryButton));
		employeeButton.setName("Employee Management");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(employeeButton);
		this.add(buttonPanel);

		//Inventory Button Stuff
		buttonPanel = new JPanel();
		JButton inventoryButton = new JButton("Inventory Management");
		inventoryButton.addActionListener(new ManagementPanelListener(employeeButton,inventoryButton));
		inventoryButton.setName("Inventory Management");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(inventoryButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton backButton = new JButton("Back to Previous Menu");
		backButton.addActionListener(new ManagementPanelListener(employeeButton,inventoryButton));
		backButton.setName("Back");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(backButton);
		this.add(buttonPanel);

	}

	public void displayError(String message) {
		errorMessage.setText(message);
	}

	public JFrame getFrame()
	{
		return frame;
	}
}
