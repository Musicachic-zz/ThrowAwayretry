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

import java.util.Scanner;

/**
 * This class is contains the method that prompts the user for their username
 * and password. It contains the hardcoded username and password we are using
 * during the prototyping phase.
 */
public class Login
{
	/* This method is for getting the input of the username from the user. Eventually I will need a validator class to call
to verify that the username is 6-12 alphanumeric characters long as per the spec document.*/

	/**
	 * This method prompts the user to enter their username and then
	 * validates against a hardcoded username during the prototype phase.
	 *
	 * @return username This is the username of the employee using the program.
	 */

	public static String username()
	{

		Employee employee = new Employee();
		//Will use this boolean more when actually validating the password.
		boolean isValid = false;

		String username = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Login Display");
		System.out.println();

		while (!isValid)
		{
			System.out.print("Enter your username: ");
			username = sc.nextLine();

			if (username.isEmpty())
			{
				System.out.println("Error! Username is required. Try again.");
			}
			else if (!username.equalsIgnoreCase("employee"))
			{
				System.out.println("Error! Username doesn't exist. Try again.");
			}
			else
			{
				isValid = true;
			}

		}
		return username;
	}

	/**
	 * This method prompts the user to enter their password and then
	 * validates against a hardcoded password during the prototype phase.
	 *
	 * @return password This is the password of the employee using the
	 *         program. Eventually there will be a list of usernames and passwords
	 *         and must fit the requirements in the spec.
	 */

	public static String password()
	{

		Scanner sc = new Scanner(System.in);

		String password = null;
		//char[] pass = "password".toCharArray();

		boolean isValid = false;

		while (!isValid)
		{
			System.out.print("Enter your password: ");
			password = sc.nextLine();

/*			if (password.equals(""))
			{
				System.out.println("Error! Password is required. Try again.");
			}*/

			//Tried to implement using in char[] but confused the hell out of me. Will need to get help on this.
			if (password.equals("password"))
			{
				isValid = true;
				System.out.println("Login Successful");
				System.out.println();
			}
			else
			{

				System.out.println("Error! Password is invalid. Try again.");
			}
		}
		return password;
	}

}

