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
public class OperatorPadGUI {
	
	private final static String[] simpleOperators = {"*", "/", "+", "-"};
	private final static String eqText = "=";
	
	public OperatorPadGUI() {
	}
	
	public JPanel createSimpleOperatorPad(JLabel displayLbl) {
		JPanel operatorPanel = new JPanel();
		operatorPanel.setLayout(new GridLayout(5, 1)); //layout is 4 rows and 1 column
		
		for(String i : simpleOperators) {
			JButton btn = new JButton(i);
			btn.setText(i);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					displayLbl.setText(displayLbl.getText() + " " + i + " ");
				}
			});
			operatorPanel.add(btn);
		}
		
		operatorPanel.add(createEqualsBtn());
		
		return operatorPanel;
	}
	
	public JButton createEqualsBtn() {
		JButton eqBtn = new JButton();
		
		eqBtn.setText(eqText);
		
		eqBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		return eqBtn;
	}

}
