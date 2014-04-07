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

import pottst1Prototype.data.Employee;
import pottst1Prototype.data.ExtractEmployees;
import pottst1Prototype.display.LoginDisplay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class LoginButtonListener implements ActionListener
{

	private JTextField username;
	private JPasswordField password;
	private static List<Employee> employee = ExtractEmployees.employee;
	private LoginPanel loginView;
	private Employee loggedInEmployee = null;

	public LoginButtonListener(JTextField username, JPasswordField password, LoginPanel loginView)
	{
		this.username = username;
		this.password = password;
		this.loginView = loginView;
	}

	public LoginButtonListener(LoginPanel loginPanel)
	{
		//To change body of created methods use File | Settings | File Templates.
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{

		System.out.println("Login button clicked.");

		if (username == null || username.getText().isEmpty() || password == null || password.getPassword().length == 0)
		{
			loginView.printLoginError();
		}

		else if (arg0.getSource() instanceof JButton)
		{
			JButton source = (JButton) arg0.getSource();

			source.setText("Logging in...");
			source.setEnabled(false);

			System.out.println("Username: " + username.getText());
			System.out.println("Password: " + new String(password.getPassword()));

			if (LoginDisplay.usernameAndPasswordLogin(employee,
			                                          username.getText(),
			                                          new String(password.getPassword())))
			{
				loginView.displayError("Successful");
				JFrame frame = loginView.getFrame();
				frame.getContentPane().removeAll();
				frame.add(new SalesOrderPanel());
				frame.repaint();
			}
			else
			{
				loginView.printLoginError();
				source.setText("Log In");
				source.setEnabled(true);
			}
		}
		else
		{
			loginView.displayError("This should not happen... Please contact your system administrator.");
		}

	}

}
