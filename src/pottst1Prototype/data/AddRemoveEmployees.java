/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/15/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

import java.io.*;
import java.util.Scanner;

public class AddRemoveEmployees
{
	private static Scanner sc = new Scanner(System.in);
	private static Employee em;
	static String e = Employee.EMPLOYEE_LEVEL;
	static String m = Employee.MANAGER_LEVEL;
	static File f;
	static PrintWriter pw = null;

	public static void doesFileExist(){
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

		//PrintWriter pw = null;

		try
		{
			pw = new PrintWriter(new FileOutputStream(f, true));
		} catch (FileNotFoundException e)
		{
			System.out.println("Could not locate file.");
		}
	}

	public static void addEmployee()
	{
		File f = new File("Employee.txt");



		String choice = "y";
		try
		{
			PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));

			while (choice.equalsIgnoreCase("y"))
			{
				System.out.print("Please enter the username you would like to add: ");
				String username = sc.nextLine().toUpperCase();

				System.out.print("Please enter the password you would like to add: ");
				char[] password = sc.nextLine().toCharArray();

				System.out.print("What is the access level? E for Employee or M for Manager");
				String levelEntered = sc.nextLine();

				String employeeLevel = null;
				boolean successful = false;

				while (successful == false)
				{
					switch (levelEntered.toUpperCase())
					{
						case "E":
							employeeLevel = e;
							successful = true;
							break;
						case "M":
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

				pw.close();
			}
		} catch (FileNotFoundException e1)
		{
			e1.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}
	}




	public static void removeEmployee(){

	}
}
