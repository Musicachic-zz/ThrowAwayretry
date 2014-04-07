/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/27/14
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

public class InvoicePanelListener implements ActionListener
{
	private JTextField upcField;
	private JTextField qtyField;
	private JButton addButton;
	private JButton removeButton;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Button clicked");

		if(e.getSource() instanceof JButton){
			JButton source = (JButton) e.getSource();

			source.setText("Please wait...");
			source.setEnabled(false);
		}
	}
}
