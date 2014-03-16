/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/10/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.display;

import pottst1Prototype.data.AddRemoveEmployees;
import pottst1Prototype.data.Employee;
import pottst1Prototype.data.ProductAndInventory;
import java.util.Scanner;

/**
 * This class has the display options for the managers menu and lets the user input their choice.
 */

public class ManagersDisplay
{

	private static Scanner sc = new Scanner(System.in);

	/**
	 * This method has the manager's menu and prompts them to enter in which option they would like.
	 */
	public static void initialMgrsDisplay()
	{
		Login.username();
		Employee employee = Login.getLoggedInEmployee();

		if (employee.getAccessLevel().equalsIgnoreCase("Manager"))
		{
			System.out.print("Would you like to Add employee, Remove employee, " +
					                 "Inventory or Exit? Add/Remove/Inventory/Exit: ");
			String managersChoice = sc.nextLine();
			switch (managersChoice.toUpperCase())
			{
				case "ADD":
					System.out.println("You selected Add Employee");
					AddRemoveEmployees.addEmployee();
					break;
				case "REMOVE":
					System.out.println("You selected Remove Employee");
					AddRemoveEmployees.removeEmployee();
					break;
				case "INVENTORY":
					System.out.println("You selected Inventory");
					ProductAndInventory.addNewProduct();
					break;
				case "EXIT":
					System.out.println();
					initialMgrsDisplay();
					break;
				default:
					System.out.println("Please enter a valid option.");
					initialMgrsDisplay();
					break;

			}
			InitialSalesDisplay.initialDisplay();
		}
		else
		{
			System.out.println("You are not allowed to access this menu.");
			InitialSalesDisplay.initialDisplay();
		}
	}
}

