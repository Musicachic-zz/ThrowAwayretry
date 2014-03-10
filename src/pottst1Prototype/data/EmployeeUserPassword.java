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
import java.util.List;
import java.util.Scanner;

public class EmployeeUserPassword
{
	private static Scanner sc = new Scanner(System.in);
	private static Employee em;
	String e = Employee.EMPLOYEE_LEVEL;
	String m = Employee.MANAGER_LEVEL;

	public static void createEmployeeFile()
	{
		String s = sc.nextLine();
		Employee em = new Employee();
		String choice = "y";

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

		while (choice.equalsIgnoreCase("y"))
		{
			if(pw !=null){

				System.out.println("Create a manager or employee? (m/e)");
				String accessLevel = s;

				pw.write(em.getAccessLevel(s) + "\t");
				pw.write(em.getUsername(s) + "\t");
				pw.write(em.getPassword(s) + "\t");
			}

			System.out.println("Would you like to continue? (y/n)");
			choice = s;
		}

	}
}
