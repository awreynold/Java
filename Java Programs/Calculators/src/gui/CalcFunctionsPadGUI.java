/**
 * 
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Art
 *
 */
public class CalcFunctionsPadGUI {
	
	public CalcFunctionsPadGUI() {
	}
	
	public JPanel createSimplifiedCalcFunctionBtnPad(JLabel displayLbl) {
		JPanel functionPanel = new JPanel();
		functionPanel.setLayout(new GridLayout(1, 1));
		
		String[] functions = {"CE", "C", "<~"};
		
		for(String i : functions) {
			JButton btn = new JButton(i);
			btn.setText(i);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
			
			functionPanel.add(btn);
		}
		
		return functionPanel;
	}

}
