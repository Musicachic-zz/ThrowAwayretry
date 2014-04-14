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
import pottst1Prototype.data.ExtractEmployees;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * This class contains the actions when the employee panel buttons are pressed.
 */

public class EmployeePanelListener implements ActionListener
{
	private static Employee em;
	private static DefaultListModel<Employee> employee;
	private JTextField user = new JTextField(12);
	private JTextField password = new JTextField(20);
	private JTextField access = new JTextField();
	private JButton addButton;
	private JButton remove;
	private static EmployeePanel employeeView;
	static PrintWriter pw = null;

	/**
	 * This is the constructor for the EmployeePanelListener.
	 *
	 * @param user
	 * @param password
	 * @param access
	 * @param addButton
	 * @param remove
	 * @param employeeView
	 */
	public EmployeePanelListener(JTextField user, JTextField password, JTextField access, JButton addButton,
	                             JButton remove, EmployeePanel employeeView)
	{

		this.user = user;
		this.password = password;
		this.access = access;
		this.addButton = addButton;
		this.remove = remove;
		this.employeeView = employeeView;

	}

	/**
	 * This is the method that does the work to add an employee.
	 *
	 * @param e
	 */
	private void add(ActionEvent e)
	{

		System.out.println("Add employee button clicked.");

		if (e.getSource() instanceof JButton)
		{
			JButton source = (JButton) e.getSource();

			File f = new File("Employee.txt");

			try
			{

				PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
				user.getText().toUpperCase();
				password.getText().toCharArray();
				access.getText();
				//em = new Employee(user, password, access);
				for (Employee em : ExtractEmployees.employee)
				{

					if (em.getUsername().equals(user.getText()))
					{

						employeeView.displayError("User already exists.");
					}
					else
					{
						pw.write(em.getAccessLevel() + "\t");
						pw.write(em.getUsername() + "\t");
						pw.write(String.valueOf(em.getPassword()) + "\n");
						pw.flush();
						employeeView.displayOk("User added.");
						//employee.addElement(em);
					}
					pw.close();
				}

			}
			catch (FileNotFoundException a)
			{

				a.printStackTrace();
			}

		}
	}

	/**
	 * This is the method that does the work to remove an employee.
	 *
	 * @param e
	 */
	private void remove(ActionEvent e)
	{

	}

	/**
	 * This is the method that does the work to go back to the sales menu.
	 */
	public static void backToMenu()
	{

		JFrame frame = employeeView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new ManagementPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Add Employee, Remove Employee, and Back buttons.
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
			case "Add Employee":
				add(e);
				break;
			case "Remove Employee":
				remove(e);
				break;
			case "Back":
				backToMenu();
				break;

		}
	}

}
