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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class contains the listener for the management panel.
 */
public class ManagementPanelListener implements ActionListener
{

	private static JButton employeeButton;
	private static JButton inventoryButton;
	private static JButton backButton;
	private static ManagementPanel mgmtView;

	/**
	 * This method is the constructor for the ManagementPanelListener.
	 *
	 * @param mgmtView
	 * @param employeeButton
	 * @param inventoryButton
	 * @param backButton
	 */
	public ManagementPanelListener(ManagementPanel mgmtView, JButton employeeButton, JButton inventoryButton,
	                               JButton backButton)
	{

		this.employeeButton = employeeButton;
		this.inventoryButton = inventoryButton;
		this.backButton = backButton;
		this.mgmtView = mgmtView;
	}

	/**
	 * This method calls the code to take the user to the employee modification screen.
	 */
	private void employee()
	{

		System.out.println("Employee button clicked.");
		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new EmployeePanel(frame));
		frame.revalidate();
	}

	/**
	 * This method calss the code to take the user to the inventory modification screen.
	 */
	private void inventory()
	{
		System.out.println("Inventory button clicked");
		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new InventoryPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the method that does the work to go back to the sales menu.
	 */
	public static void backToMenu()
	{

		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}

	/**
	 * This is the required actionPerformed method for implementing the ActionListener for this class. It contains
	 * the routing to the various methods when you click the Employment Management, Inventory Management,
	 * and Back buttons.
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
			case "Employee Management":
				employee();
				break;
			case "Inventory Management":
				inventory();
				break;
			case "Back":
				backToMenu();
				break;

		}
	}
}
