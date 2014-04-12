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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementPanelListener implements ActionListener
{

	private static JButton employeeButton;
	private static JButton inventoryButton;
	private static JButton backButton;
	private static ManagementPanel mgmtView;

	public ManagementPanelListener(JButton employeeButton,JButton inventoryButton, JButton backButton){

		this.employeeButton = employeeButton;
		this.inventoryButton = inventoryButton;
		this.backButton = backButton;
	}

	private void employee(){

		System.out.println("Employee button clicked.");
		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new EmployeePanel(frame));
		frame.revalidate();
	}

	private void inventory(){
		System.out.println("Inventory button clicked");
		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new InventoryPanel(frame));
		frame.revalidate();
	}

	public static void backToMenu()
	{

		JFrame frame = mgmtView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}


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
