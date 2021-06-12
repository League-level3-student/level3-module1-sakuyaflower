package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements KeyListener, ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> values = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton("Add Entry");
	JButton searchID = new JButton("Search By ID");
	JButton viewList = new JButton("View List");
	JButton removeEntry = new JButton("Remove Entry");
	static _02_LogSearch game = new _02_LogSearch();

	public static void main(String[] args) {
		game.setup();
	}

	void setup() {
		frame.add(panel);
		panel.add(addEntry);
		panel.add(searchID);
		panel.add(viewList);
		panel.add(removeEntry);
		frame.setVisible(true);
		addEntry.addActionListener(this);
		searchID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		frame.pack();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		String name = "";
		int id = 0;
		if (pressed == addEntry) {
			String idNumber = JOptionPane.showInputDialog(null, "Please enter your ID number.");
			id = Integer.parseInt(idNumber);
			name = JOptionPane.showInputDialog(null, "Please enter your name.");
			values.put(id, name);
		} else if (pressed == searchID) {
			String enterID = JOptionPane.showInputDialog(null, "Please enter ID here.");
			int i = Integer.parseInt(enterID);
			if (values.get(i) == null) {
				JOptionPane.showMessageDialog(null, "Sorry your ID does not exist.");
			}
			else {
				JOptionPane.showMessageDialog(null, values.get(i));
			}
		} else if (pressed == viewList) {
			String output = "";
			for(int numbers: values.keySet()) {
				output += "ID: ";
				output += numbers;
				output += "           Name: ";
				output += values.get(numbers);
				output += "\n";

			}
			JOptionPane.showMessageDialog(null, output);
		}

		else if (removeEntry == pressed) {
			String idNumber = JOptionPane.showInputDialog(null, "Please enter an ID.");
			int i = Integer.parseInt(idNumber);
			if (values.containsKey(i)) {
				values.remove(i);
			} else {
				JOptionPane.showMessageDialog(null, "The ID is not present in the list.");
			}
		}
	}
}
