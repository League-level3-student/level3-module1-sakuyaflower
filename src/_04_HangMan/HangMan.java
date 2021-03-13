package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<String> words = new Stack<String>();
	static HangMan game = new HangMan();
	String characWord;

	public static void main(String[] args) {
		game.theHangManGame();
		game.setup();
		game.getNextWord();
	}

	void setup() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

void theHangManGame() {
	String answer = JOptionPane.showInputDialog(null,"Pick a number up too " + Utilities.getTotalWordsInFile("dictionary.txt"));	
	int finalNumber = Integer.parseInt(answer);
	for(int i = 0; i < finalNumber; i++) {
	String word = Utilities.readRandomLineFromFile("dictionary.txt");
	if(!words.contains(word)) {
		words.push(word);
	}
}
}
void getNextWord() {
	String labelText = "";
if(!words.isEmpty()) {
	characWord = words.pop();
	for(int i = 0; i < characWord.length(); i++) {
		labelText += "_ ";
	}
	label.setText(labelText);
	frame.pack();
	System.out.println(characWord);
}
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	char pressed = arg0.getKeyChar();
	String newLabel = "";
	if(!characWord.contains("" + pressed)) {
		//lose a life in the game
		return;
	}
	else {
		for(int i = 0; i < characWord.length(); i++) {
			if(characWord.charAt(i) == pressed) {
				newLabel += pressed;
			}
			else {
				newLabel += label.getText().charAt(i*2);
				
			}
			newLabel += " ";
		}	
	label.setText(newLabel);
	frame.pack();
	}
//if words have been guess move on to the next
	//lose a life
	//add a stack for letters that are incorrect
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
