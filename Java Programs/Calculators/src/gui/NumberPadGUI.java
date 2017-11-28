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
public class NumberPadGUI {
	
	private final static String[] numsForBtn = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "."}; //array that holds the buttons that should be created
	
	public NumberPadGUI() {
	}
	
	/**
	 * creates the number buttons that need to be added to the number pad panel
	 * @param displayLbl JLabel that will display the numbers and operators clicked
	 * @return JPanel that holds all the number buttons
	 */
	public JPanel createNumberPad(JLabel displayLbl){
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4, 3)); //grid having 4 rows and 3 columns
		
		for(String i : numsForBtn) {
			JButton btn = new JButton("numBtn" + i);
			btn.setText(i);
			
			//adds the on click action listener for each button created
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					displayLbl.setText(displayLbl.getText() + String.valueOf(i));
					
				}
			});
			buttonPanel.add(btn);	
		}
		
		return buttonPanel; //returns the panel with all the buttons added to it
	}

}
