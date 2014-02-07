package pottst1Prototype.display;


/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 2/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

import pottst1Prototype.data.Employee;

import java.util.Scanner;

public class Login
{
	/* This method is for getting the input of the username from the user. Eventually I will need a validator class to call
to verify that the username is 6-12 alphanumeric characters long as per the spec document.*/


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

/* This method is for getting the input of the password from the user. We want to use char so the password cannot
   easily stolen as a security feature. Eventually we want to validate the password is correct and meets the specs
   doc of 8-20 characters long including letters, numbers, and special characters. */

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

