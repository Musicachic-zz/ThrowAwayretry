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

import pottst1Prototype.data.Employee;

import javax.swing.*;
import java.awt.*;

/**
 * This class sets up the fields for being used on the employee screen.
 */
public class EmployeePanel extends JPanel
{

	private static Employee em;
	private JTextField user = new JTextField(12);
	private JTextField password = new JTextField(20);
	private JTextField access = new JTextField(8);
	private EmployeePanel employeeView = this;
	private JButton addButton;
	private JButton remove;
	private JFrame frame;
	private JLabel errorMessage = new JLabel("");
	private JLabel displayOk = new JLabel("");

	/**
	 * This method sets up the fields for being used on the employee screen.
	 *
	 * @param frame
	 */
	public EmployeePanel(JFrame frame)
	{

		this.frame = frame;
		this.em = em;

		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                             .getSize()));
		errorMessage.setForeground(Color.RED);

		font = displayOk.getFont();
		displayOk.setFont(new Font(font.getFontName(), Font.BOLD, font
				                                                          .getSize()));
		displayOk.setForeground(Color.BLUE);

		JPanel userPanel = new JPanel();
		userPanel.setLayout(new FlowLayout());
		userPanel.add(new JLabel("Username"));
		userPanel.add(user);
		this.add(userPanel);

		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(new FlowLayout());
		passwordPanel.add(new JLabel("Password"));
		passwordPanel.add(password);
		this.add(passwordPanel);

		JPanel accessPanel = new JPanel();
		accessPanel.setLayout(new FlowLayout());
		accessPanel.add(new JLabel("Access Level"));
		accessPanel.add(access);
		this.add(accessPanel);

		JPanel buttonPanel = new JPanel();
		JButton addEmployee = new JButton("Add Employee");
		addEmployee.addActionListener(new EmployeePanelListener(user, password, access, addButton, remove,
		                                                        employeeView));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(addEmployee);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeEmployee = new JButton("Remove Employee");
		addEmployee.addActionListener(new EmployeePanelListener(user, password, access, addButton, remove,
		                                                        employeeView));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(removeEmployee);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton backButton = new JButton("Back to Previous Menu");
		backButton.addActionListener(new EmployeePanelListener(user, password, access, addButton, remove,
		                                                       employeeView));
		backButton.setName("Back");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(backButton);
		this.add(buttonPanel);

	}

	/**
	 * This is a generic error message method that is used to display errors on each page.
	 *
	 * @param message
	 */
	public void displayError(String message)
	{
		errorMessage.setText(message);
	}

	/**
	 * This is a generic message method that is used to display when something is processed on some pages.
	 *
	 * @param message
	 */
	public void displayOk(String message)
	{
		displayOk.setText(message);
	}

	/**
	 * This is a generic method to help transition between frames.
	 *
	 * @return JFrame
	 */
	public JFrame getFrame()
	{
		return frame;
	}

}
