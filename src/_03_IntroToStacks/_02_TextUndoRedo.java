package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> letters = new Stack<Character>();
	Stack<Character> deleted = new Stack<Character>();
	
	
	
	void basics() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
	}

public static void main(String[] args) {
	 _02_TextUndoRedo text = new _02_TextUndoRedo();
	 text.basics();
}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

    void makeLabelFromStack() {
    	// In this method, write a loop that gets each Character in the letters stack and 
    	// adds it to a String, then makes the String the label to display.
    	
    	String newLabelText = "";
    
    	// Loop goes here
    	for(int i = 0; i < letters.size(); i++) {
    		newLabelText+=letters.get(i);
    	}
    	System.out.println(newLabelText);
    	label.setText(newLabelText);
    	
    }
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();		
		System.out.println(key);
		
		if(KeyEvent.VK_BACK_SPACE == key) {
			char letter = letters.pop();
			deleted.push(letter);
			
		}
		
		else if(KeyEvent.VK_RIGHT == (int) key) {
			// Is this the redo key?
			// It takes the last char you deleted and puts it back into the letters
			if(!deleted.isEmpty()) {
				char letter = deleted.pop();
				letters.push(letter);
			
			}
			
		}
		
		else {
			letters.push(key);
		}
		
		makeLabelFromStack();
		frame.pack();
		
		
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
