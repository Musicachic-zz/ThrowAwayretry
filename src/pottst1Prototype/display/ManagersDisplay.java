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
import java.util.Scanner;

public class ManagersDisplay
{

	private static Scanner sc = new Scanner(System.in);

	public static void initialMgrsDisplay()
	{
		Login.username();
		Employee employee = Login.getLoggedInEmployee();

			if (employee.getAccessLevel().equalsIgnoreCase("Manager"))
			{
				System.out.print("Would you like to add employee, remove employee, or exit?");
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

