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
import java.util.Scanner;

public class ExtractEmployees
{

	public static void readEmployeeFile()
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
		String in = sc.nextLine();
		System.out.println(in);
		String[] fields = in.split("\t");
		System.out.println("Username: " + fields[0]);
		System.out.println("Password: " + fields[1]);
		System.out.println("Access Level: " + fields[2]);

	}


}
}
