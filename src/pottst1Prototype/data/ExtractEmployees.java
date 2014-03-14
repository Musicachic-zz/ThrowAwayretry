/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/12/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractEmployees
{
	public static List<Employee> employee = new ArrayList<>();

	public static List<Employee> readEmployeeFile()
{

	//Scanner sc = new Scanner(System.in);
	File f = new File("Employee.txt");

	Scanner sc = null;

	try
	{
		sc = new Scanner(f);
	} catch (FileNotFoundException e)
	{
		System.out.println("Could not open file.");
	}

	while (sc.hasNextLine())
	{
		Employee e = new Employee();
		String in = sc.nextLine();
		System.out.println(in);
		String[] fields = in.split("\t", -1);
		e.setUsername(fields[1]);
		e.setPassword(fields[2].toCharArray());
		e.setAccessLevel(fields[0]);
		System.out.println("Username: " + fields[1]);
		System.out.println("Password: " + fields[2]);
		System.out.println("Access Level: " + fields[0]);
		employee.add(e);

	}

	return employee;

}
}
