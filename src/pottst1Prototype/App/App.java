/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/
package pottst1Prototype.App;

import GUI.InvoicePanel;
import pottst1Prototype.data.ExtractEmployees;
import pottst1Prototype.data.ExtractProductsandInventory;
import GUI.LoginPanel;
import GUI.SalesOrderPanel;
import pottst1Prototype.display.AddRemoveEmployeesDisplay;
import pottst1Prototype.display.InitialSalesDisplay;
import pottst1Prototype.display.LoginDisplay;
import pottst1Prototype.display.ProductAndInventoryDisplay;

import javax.swing.*;
import java.awt.*;

/**
 * This class contains only the main method that calls the methods that will
 * fire off the application.
 */

public class App
{
	/**
	 * This method is the main method that fires off the running of the POP
	 * project.
	 */

	public static void main(String[] args)
	{
		AddRemoveEmployeesDisplay.doesFileExist();
		ExtractEmployees.readEmployeeFile();
		ProductAndInventoryDisplay.doesFileExist();
		ExtractProductsandInventory.readProductFile();

		//This is for calling the GUI to load.

		JFrame f = new JFrame("GUI Demo");

		//Login Panel Stuff
		f.setMinimumSize(new Dimension(600, 400));
		f.setResizable(false);
		f.add(new LoginPanel());
		f.setVisible(true);

		//Initial Sales Display Stuff
/*		f = new JFrame("Sales Panel");
		f.setMinimumSize(new Dimension(600, 400));
		f.setResizable(false);
		f.add(new SalesOrderPanel());
		f.setVisible(true);*/

		//Invoice Panel Stuff
/*		f = new JFrame("Invoice Panel");
		f.setMinimumSize(new Dimension(600, 400));
		f.setResizable(false);
		f.add(new InvoicePanel());
		f.setVisible(true);*/

	// Back to getting the command line involved.
		LoginDisplay.username();
		InitialSalesDisplay.initialDisplay();
	}
}
