/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/25/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginButtonListener implements ActionListener {

	private JTextField username;
	private JPasswordField password;

	public LoginButtonListener(JTextField username, JPasswordField password) {
		this.username = username;
		this.password = password;
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
