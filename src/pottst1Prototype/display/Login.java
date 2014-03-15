/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/9/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.display;

import pottst1Prototype.data.Employee;
import pottst1Prototype.data.ExtractEmployees;

import java.util.List;
import java.util.Scanner;

/**
 * This class is contains the method that prompts the user for their username
 * and password. It contains the hardcoded username and password we are using
 * during the prototyping phase.
 */
public class Login
{
	private static Employee loggedInEmployee;
	private static String loggedInUsername;
	/**
	 * This method prompts the user to enter their username and then
	 * validates against a hardcoded username during the prototype phase.
	 *
	 * @return username This is the username of the employee using the program.
	 */

		/* This method is for getting the input of the username from the user. Eventually I will need a validator
		class to
	call
	to verify that the username is 6-12 alphanumeric characters long as per the spec document.*/
	public static void username()
	{
		List<Employee> employee = ExtractEmployees.readEmployeeFile();

		String tempUsername = null;
		String username = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Login Display");
		System.out.println();

		while (tempUsername == null)
		{
			System.out.print("Enter your username: ");
			username = sc.nextLine();

			if (username == null || username.isEmpty())
			{
				System.out.println("Error! Username is required. Try again.");
			}
			else if (!username.isEmpty())
			{
				for (Employee e : employee)
				{

					if (e.getUsername().equals(username))
					{
						//Todo:create temporary username
						tempUsername = String.valueOf(e);
						loggedInUsername = username;
						break;
					}
				}

			}
			if (tempUsername == null)
			{
				System.out.println("Error! Username doesn't exist. Try again.");
			}
		}
		password();

	}

	/**
	 * This method prompts the user to enter their password and then
	 * validates against a hardcoded password during the prototype phase.
	 *
	 * @return password This is the password of the employee using the
	 *         program. Eventually there will be a list of usernames and passwords
	 *         and must fit the requirements in the spec.
	 */

	public static void password()
	{
		List<Employee> employee = ExtractEmployees.readEmployeeFile();
		String password = "";
		String tempPassword = null;
		Scanner sc = new Scanner(System.in);

		//char[] pass = "password".toCharArray();

		boolean isValid = false;

		while (tempPassword == null)
		{
			System.out.print("Enter your password: ");
			password = sc.nextLine();

/*			if (password.equals(""))
			{
				System.out.println("Error! Password is required. Try again.");
			}*/

			//Tried to implement using in char[] but confused the hell out of me. Will need to get help on this.
			if (password == null || password.isEmpty())
			{
				System.out.println("Error! Password is required.");

			}
			else if (!password.isEmpty())
			{
				for (Employee e : employee)
				{
					if (e.getUsername().equals(loggedInUsername) && String.valueOf(e.getPassword()).equals(password))
					{
						System.out.println("Login Successful");
						tempPassword = String.valueOf(e);
						loggedInEmployee = e;
						break;
					}
				}
			}
			if (tempPassword == null)
			{
				System.out.println("Error! Password is invalid. Try again.");
			}
		}

	}

	public static Employee getLoggedInEmployee(){
		return loggedInEmployee;
	}
}

