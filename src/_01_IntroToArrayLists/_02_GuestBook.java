package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames =  new JButton("View Name");
	JLabel label = new JLabel();
	ArrayList<String> guestBook = new ArrayList<String>();
	
	void buttonMaker() {
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		frame.add(panel);
		panel.add(addName);
		panel.add(viewNames);
		panel.add(label);
		frame.setVisible(true);
		frame.setTitle("Guest Book");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed == addName) {
			String answer = JOptionPane.showInputDialog(null, "Please enter a name.");
			guestBook.add(answer);
		}
	
		if(pressed == viewNames) {
		String people = "";
			for(int i = 0; i < guestBook.size(); i++) {
			people += "Guest #" + (i+1) + ": ";
			people += guestBook.get(i);
			people += "\n";
			
			}
						
			JOptionPane.showMessageDialog(null, people);

			}
		}
		
	}
	
	
	

