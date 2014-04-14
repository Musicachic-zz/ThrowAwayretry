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

import javax.swing.*;
import java.awt.*;

/**
 * This class was done as a group in class for our first experience with swing pottst1Prototype.GUI.
 *
 * @author HoffmanZ
 */
public class LoginPanel extends JPanel
{

	private static final long serialVersionUID = 4932513626147661013L;
	private JLabel errorMessage = new JLabel("");
	private JFrame frame;
	private LoginButtonListener trigger = new LoginButtonListener(this);
	private JTextField uf = new JTextField(10);
	private JPasswordField pf = new JPasswordField(10);

	/**
	 * This method creates all the fields and buttons for the login screen.
	 *
	 * @param frame
	 */
	public LoginPanel(JFrame frame)
	{
		// this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// this.setLayout(new BorderLayout());
		super(new GridLayout(7, 3));
		this.frame = frame;

		Font font = errorMessage.getFont();
		errorMessage.setFont(new Font(font.getFontName(), Font.BOLD, font.getSize()));
		errorMessage.setForeground(Color.RED);



/*		JTextField uf = new JTextField();
		uf.setColumns(10);

		JPasswordField pf = new JPasswordField();
		pf.setColumns(10);*/

		this.add(new JPanel());
		this.add(errorMessage);
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
		loginButton.addActionListener(new LoginButtonListener(uf, pf, this));
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

	/**
	 * This method is used to create a error message for the login screen only.
	 */
	public void printLoginError()
	{
		errorMessage.setText("Invalid username/password.");
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
	 * This is a generic method to help transition between frames.
	 *
	 * @return JFrame
	 */
	public JFrame getFrame()
	{
		return frame;
	}
}