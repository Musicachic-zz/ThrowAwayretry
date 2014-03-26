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

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * This class was done as a group in class for our first experience with swing GUI.
 *
 *@author HoffmanZ
 *
 */
public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 4932513626147661013L;

	public LoginPanel() {
		// this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// this.setLayout(new BorderLayout());
		this.setLayout(new GridLayout(7,3));

		JTextField uf = new JTextField();
		uf.setColumns(10);

		JPasswordField pf = new JPasswordField();
		pf.setColumns(10);

		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());

		// Start Username section
		JPanel usernamePanel = new JPanel();
		usernamePanel.setLayout(new FlowLayout());
		usernamePanel.add(new JLabel("Username"));
		usernamePanel.add(uf);
		this.add(usernamePanel);
		// End Username section

		this.add(new JPanel());
		this.add(new JPanel());

		// Start password section
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(new FlowLayout());
		passwordPanel.add(new JLabel("Password"));
		passwordPanel.add(pf);
		this.add(passwordPanel);
		// End password section

		this.add(new JPanel());
		this.add(new JPanel());

		// Start button section
		JPanel buttonPanel = new JPanel();
		JButton loginButton = new JButton("Log In");
		loginButton.addActionListener(new LoginButtonListener(uf, pf));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(loginButton);
		this.add(buttonPanel);
		// End button section

		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
		this.add(new JPanel());
	}
}
