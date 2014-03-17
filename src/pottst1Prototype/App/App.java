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

import pottst1Prototype.data.ExtractEmployees;
import pottst1Prototype.data.ExtractProductsandInventory;
import pottst1Prototype.display.AddRemoveEmployeesDisplay;
import pottst1Prototype.display.InitialSalesDisplay;
import pottst1Prototype.display.LoginDisplay;
import pottst1Prototype.display.ProductAndInventoryDisplay;

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
		LoginDisplay.username();
		InitialSalesDisplay.initialDisplay();
	}
}
