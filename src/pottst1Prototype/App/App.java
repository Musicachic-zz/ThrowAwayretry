/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/
package pottst1Prototype.App;

import pottst1Prototype.display.InitialSalesDisplay;
import pottst1Prototype.display.InvoiceApp;
import pottst1Prototype.display.Login;

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

		Login.username();
		Login.password();
		System.out.println("Sales Display\n");
		InitialSalesDisplay.initialDisplay();
	}
}
