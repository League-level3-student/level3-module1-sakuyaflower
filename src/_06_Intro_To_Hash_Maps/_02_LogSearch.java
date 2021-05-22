package _06_Intro_To_Hash_Maps;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements KeyListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	HashMap<Integer, String> values = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("Add Entry"); 
	JButton buttonTwo = new JButton("Search By ID");
	JButton buttonThree = new JButton("View List");
	static _02_LogSearch game = new _02_LogSearch();
	public static void main(String[] args) {
		game.setup();
	}
	void setup() {
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		frame.setVisible(true);
		buttonOne.addKeyListener(this);
		frame.pack();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 JButton pressed = (JButton) e.getSource();
		 if(pressed == buttonOne) {
			 String idNumber = JOptionPane.showInputDialog(null, "Please enter your ID number.");
			 int i = Integer.parseInt(idNumber);
			 String name = JOptionPane.showInputDialog(null, "Please enter your name.");
		 }
	values.put(i, name);
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
