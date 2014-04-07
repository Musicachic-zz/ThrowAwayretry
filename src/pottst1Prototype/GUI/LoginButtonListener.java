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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

public class LoginButtonListener implements ActionListener {

	private JTextField username;
	private JPasswordField password;
	private ExtractEmployees employee = new ExtractEmployees();
	private LoginPanel loginView;
	private Employee loggedInEmployee = null;

	public LoginButtonListener(JTextField username, JPasswordField password) {
		this.username = username;
		this.password = password;
		this.loginView = loginView;
	}

	public LoginButtonListener(LoginPanel loginPanel)
	{
		//To change body of created methods use File | Settings | File Templates.
	}

	public Employee doLogin(String username, char[] password, JFrame frame){
		Employee em = null;

		//em = em.getEmployee(username);

		if (em != null){
			if(Arrays.equals(em.getPassword(), password)){
				loggedInEmployee = em;
				frame.getContentPane().removeAll();
				//frame.add(new SalesDisplayView());
				frame.repaint();
			}
			if (loggedInEmployee == null) {
				loginView.printLoginError();
			}
		}
	return em;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println("Login button clicked.");

		if (arg0.getSource() instanceof JButton) {
			JButton source = (JButton) arg0.getSource();

			source.setText("Logging in...");
			source.setEnabled(false);

			System.out.println("Username: " + username.getText());
			System.out.println("Password: " + new String(password.getPassword()));
		}

	}

}
