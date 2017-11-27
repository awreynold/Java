import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Arthur William Reynolds
 * 11/24/2017
 * creates a new JFrame with a label that displays "Hello World"
 */
public class HelloWorldLabelGUIJLabel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame window = new GUI(); //creates a new instance of the GUI class
		window.setVisible(true); //sets the newly created JFrame to be visible
	}
}

	//nested class that handles creating the GUI and components that can be added to that panel
	class GUI extends JFrame //extends JFrame to use the Swing library
	{
		public GUI()
		{
			setTitle("Hello World"); // sets the title of the window
			setSize(400,300); // sets the size of the window
			setLayout(new GridBagLayout()); // sets the layout for the window
			
			Container panel1 = getContentPane(); 
			JLabel helloWorldLabel = new JLabel("Hello World"); //creates the Swing object of JLabel with the text set to 'Hello World'
			panel1.add(helloWorldLabel); // adds the label to the pane
			helloWorldLabel.setLocation(200, 150); // sets the absolute position of the label in the panel. this is done due to GridBagLayout
		}
	}
