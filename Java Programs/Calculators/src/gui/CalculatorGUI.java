/**
 * 
 */
package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
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
		
		JLabel displayLbl = createDisplayLabel();
		
		displayPanel.setLayout(new GridLayout(2, 1));
		
		displayPanel.add(displayLbl);
		
		buttonPanel = assembleButtonsPanel(displayLbl);
		
		panel1.add(displayPanel);
		panel1.add(buttonPanel);
	}
	
	private void setProperties() {
		setTitle("Simplified Calculator");
		setSize(300, 400);
		setLayout(new GridLayout(2, 0));
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private JPanel assembleButtonsPanel(JLabel displayLbl) {
		JPanel buttonsPanel = new JPanel();
		
		buttonsPanel.setLayout(new GridLayout(2, 1));
		
		buttonsPanel.add(assembleFunctionPadPanel(displayLbl));
		buttonsPanel.add(assembleNumPadPanel(displayLbl));
		
		return buttonsPanel;
	}
	
	/**
	 * assembles the components of the numPadPanel that contains the number buttons and the operator buttons
	 * @param numPadPanel JPanel object that contains the number pad buttons 
	 * @param displayLbl JLabel that displays the users entered data
	 */
	private JPanel assembleNumPadPanel(JLabel displayLbl) {
		JPanel numPadPanel = new JPanel();
		numPadPanel.setLayout(new GridLayout(1, 2));
		
		NumberPadGUI numPad = new NumberPadGUI();
		OperatorPadGUI opPad = new OperatorPadGUI();
		
		numPadPanel.add(numPad.createNumberPad(displayLbl));
		numPadPanel.add(opPad.createSimpleOperatorPad(displayLbl));
		
		return numPadPanel;
	}
	
	private JPanel assembleFunctionPadPanel(JLabel displayLbl) {
		JPanel functionPad = new JPanel();
		
		CalcFunctionsPadGUI functionPadGUI = new CalcFunctionsPadGUI();
		functionPad.add(functionPadGUI.createSimplifiedCalcFunctionBtnPad(displayLbl));
		
		return functionPad;
	}
	
	private JLabel createDisplayLabel() {
		JLabel displayLabel = new JLabel();
		displayLabel.setPreferredSize(new Dimension(350, 5)); //sets the preferred size of the label. should be set if no text is being set by default
		displayLabel.setMinimumSize(new Dimension(350, 5)); //sets the minimum size of the label. should be set if no text is being set by default
		displayLabel.setBorder(BorderFactory.createLineBorder(Color.black)); //creates a border around the label of the specified color
		displayLabel.setLocation(0, 0); //sets the location of the label
		
		return displayLabel;
	}
}
