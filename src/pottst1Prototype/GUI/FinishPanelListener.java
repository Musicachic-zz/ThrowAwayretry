/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 4/13/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinishPanelListener implements ActionListener
{
	private static FinishPanel finishView;

	public static void addPayment(ActionEvent e){

	}

	public static void removePayment(ActionEvent e){


	}

	public static void backToMenu()
	{

		JFrame frame = finishView.getFrame();
		frame.getContentPane().removeAll();
		frame.add(new SalesOrderPanel(frame));
		frame.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");
		JButton source = (JButton) e.getSource();

		switch (source.getName()){

			case "Add":
				addPayment(e);
				break;
			case "Remove":
				removePayment(e);
				break;
			case "Back":
				backToMenu();
				break;
		}
	}
}
