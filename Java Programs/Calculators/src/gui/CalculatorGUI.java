/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * @author Art
 *
 */
public class CalculatorGUI extends JFrame{
	
	public CalculatorGUI() {
		setProperties();
		
		Container panel1 = getContentPane();
		
		JPanel displayPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel numPadPanel = new JPanel();
		JPanel displayFunctionPanel = new JPanel();
		JLabel displayLbl = createDisplayLabel();
		
		displayPanel.setLayout(new GridLayout(4, 1));
		buttonPanel.setLayout(new GridLayout(2, 1));
		numPadPanel.setLayout(new GridLayout(1, 2));
		displayFunctionPanel.setLayout(new GridLayout(1, 2));
		
		displayPanel.add(displayLbl);
		
		assembleNumPadPanel(numPadPanel, displayLbl);
		
		buttonPanel.add(new JLabel());
		buttonPanel.add(numPadPanel);
		
		panel1.add(displayPanel);
		panel1.add(numPadPanel);
	}
	
	private void setProperties() {
		setTitle("Simplified Calculator");
		setSize(400, 600);
		setLayout(new GridLayout(2, 0));
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/**
	 * assembles the components of the numPadPanel that contains the number buttons and the operator buttons
	 * @param numPadPanel JPanel object that contains the number pad buttons 
	 * @param displayLbl JLabel that displays the users entered data
	 */
	private void assembleNumPadPanel(JPanel numPadPanel, JLabel displayLbl) {
		JPanel numPanel = new JPanel();
		JPanel operatorPanel = new JPanel();
		
		numPanel.setLayout(new GridLayout(4, 3)); //layout is 4 rows and 3 columns
		operatorPanel.setLayout(new GridLayout(4, 1)); //layout is 4 rows and 1 column 
		
		createNumberPad(numPanel, displayLbl);
		createOperatorPad(operatorPanel, displayLbl);
		
		numPadPanel.add(numPanel);
		numPadPanel.add(operatorPanel);
	}
	
	private JLabel createDisplayLabel() {
		JLabel displayLabel = new JLabel();
		displayLabel.setPreferredSize(new Dimension(350, 5)); //sets the preferred size of the label. should be set if no text is being set by default
		displayLabel.setMinimumSize(new Dimension(350, 5)); //sets the minimum size of the label. should be set if no text is being set by default
		displayLabel.setBorder(BorderFactory.createLineBorder(Color.black)); //creates a border around the label of the specified color
		displayLabel.setLocation(0, 0); //sets the location of the label
		
		return displayLabel;
	}
	
	private void createNumberPad(JPanel buttonPanel, JLabel displayLbl){
		String[] numsForBtn = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "."};
		
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
	}
	
	private void createOperatorPad(JPanel operatorPanel, JLabel displayLbl) {
		String[] operators = {"*", "/", "+", "-"};
		
		for(String i : operators) {
			JButton btn = new JButton(i);
			btn.setText(i);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
			operatorPanel.add(btn);
		}
	}
	
	private void createCalcFunctionBtnPad(JPanel calcFunctionaPanel, JLabel displayLbl) {
		String[] functions = {"clear"};
		
		for(String i : functions) {
			JButton btn = new JButton(i);
			
			btn.setText(i);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
		}
	}
}
