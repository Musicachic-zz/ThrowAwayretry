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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeePanelListener implements ActionListener
{
	private static Employee em;
	private JTextField user = new JTextField(12);
	private JTextField password = new JTextField(20);
	private JComboBox access = new JComboBox();
	private JButton addButton;
	private JButton remove;
	private static EmployeePanel employeeView;

	public EmployeePanelListener(JTextField user, JTextField password, JComboBox access, JButton addButton,
	                             JButton remove){

		this.user = user;
		this.password = password;
		this.access = access;
		this.addButton = addButton;
		this.remove = remove;

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");

		JButton source = (JButton) e.getSource();

		switch (source.getName())
		{
			case "Add Employee":
				add();
				break;
			case "Remove Employee":
				remove();
				break;
			case "Back":
				backToMenu();
				break;


		}
	}


	public static void backToMenu()
	{

		JFrame frame = employeeView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new ManagementPanel(frame));
		frame.revalidate();
	}
}
