/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/25/14
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

public class SalesOrderPanelListener implements ActionListener
{

	private JButton add;
	private JButton remove;
	private JButton finish;
	private JButton management;
	private JButton exit;

	public SalesOrderPanelListener()
	{
		this.add = add;
		this.remove = remove;
		this.finish = finish;
		this.management = management;
		this.exit = exit;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");

		if (e.getSource() instanceof JButton){
			JButton source = (JButton) e.getSource();

			source.setText("Please wait...");
			source.setEnabled(false);
		}
	}
}
