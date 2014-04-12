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

public class EmployeePanel extends JPanel
{

	private static Employee em;
	private JTextField user = new JTextField(12);
	private JTextField password = new JTextField(20);
	private JComboBox access = new JComboBox();
	private JButton addButton;
	private JButton remove;
	private JFrame frame;
	private JLabel errorMessage = new JLabel("");


	public EmployeePanel(JFrame frame){

	this.frame = frame;



	Font font = errorMessage.getFont();
	errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font
			                                                             .getSize()));
	errorMessage.setForeground(Color.RED);

	JPanel userPanel = new JPanel();
	userPanel.setLayout(new FlowLayout());
	userPanel.add(new JLabel("Username"));
	userPanel.add(user);
	this.add(user);


	JPanel passwordPanel = new JPanel();
	passwordPanel.setLayout(new FlowLayout());
	passwordPanel.add(new JLabel("Password"));
	passwordPanel.add(password);
	this.add(password);

	JPanel accessPanel = new JPanel();
	accessPanel.setLayout(new FlowLayout());
	accessPanel.add(new JLabel("Access Level"));
	accessPanel.add(access);
	this.add(access);

	JPanel buttonPanel = new JPanel();
	JButton addEmployee = new JButton("Add Employee");
	addEmployee.addActionListener(new AddEmployeeButtonListener());
	buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	buttonPanel.add(addEmployee);
	this.add(buttonPanel);

	buttonPanel = new JPanel();
	JButton removeEmployee = new JButton("Remove Employee");
	addEmployee.addActionListener(new RemoveEmployeeButtonListener());
	buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	buttonPanel.add(removeEmployee);
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
