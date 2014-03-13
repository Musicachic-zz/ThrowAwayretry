/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/6/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

import java.io.*;
import java.util.Scanner;

public class EmployeeUserPassword
{
	private static Scanner sc = new Scanner(System.in);
	private static Employee em;
	static String e = Employee.EMPLOYEE_LEVEL;
	static String m = Employee.MANAGER_LEVEL;
	static File f;

	public static void createAndAddEmployeeFile()
	{
		File f = new File("Employee.txt");

		if (!f.exists())
		{
			try
			{
				f.createNewFile();
			} catch (IOException e)
			{
				System.out.println("Could not create file.");
				System.exit(-1);
			}
		}

		PrintWriter pw = null;

		try
		{
			pw = new PrintWriter(new FileOutputStream(f, true));
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not locate file.");
		}

		String choice = "y";

		if (pw != null)
		{
			while (choice.equalsIgnoreCase("y"))
			{

				System.out.print("What is the username? ");
				String username = sc.nextLine();

				System.out.print("What is the password? ");
				char[] password = sc.nextLine().toCharArray();

				System.out.print("What is the access level? Employee or Manager ");
				String levelEntered = sc.nextLine();

				String employeeLevel = null;
				boolean successful = false;

				while (successful == false)
				{
					switch (levelEntered.toUpperCase())
					{
						case "EMPLOYEE":
							employeeLevel = e;
							successful = true;
							break;
						case "MANAGER":
							employeeLevel = m;
							successful = true;
							break;
						default:
							System.out.print("Please enter a valid access level. Employee or Manager ");
							levelEntered = sc.nextLine();
							successful = false;
					}
				}

				Employee em = new Employee(username, password, employeeLevel);
				//String choice = "y";

				pw.write(em.getAccessLevel() + "\t");
				pw.write(em.getUsername() + "\t");
				pw.write(String.valueOf(em.getPassword()) + "\n");

				System.out.print("Would you like to add another user? Y or N ");
				choice = sc.nextLine();
			}
			pw.close();


		/*while (choice.equalsIgnoreCase("y"))
		{
			if(pw !=null){

				System.out.println("Create a manager or employee? (m/e)");
				//String accessLevel = s;

				pw.write(em.getAccessLevel() + "\t");
				pw.write(em.getUsername() + "\t");
				pw.write(em.getPassword() + "\t");
			}

			//System.out.println("Would you like to continue? (y/n)");
			//choice = s;
		}*/

		}
/*		Scanner sc = null;

		try
		{
			sc = new Scanner(f);
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not open file.");
		}

		while (sc.hasNextLine())
		{
			String in = sc.nextLine();
			System.out.println(in);
			String[] fields = in.split("\t");
			System.out.println("Username: " + fields[0]);
			System.out.println("Password: " + fields[1]);
			System.out.println("Access Level: " + fields[2]);

		}*/
	}
}
