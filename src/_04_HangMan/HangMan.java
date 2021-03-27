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
	JLabel lives = new JLabel();
	Stack<String> words = new Stack<String>();
	Stack<String> wrongWords = new Stack<String>(); 
	static HangMan game = new HangMan();
	String characWord;
	int tries = 7;
	public static void main(String[] args) {
		game.theHangManGame();
		game.setup();
		game.getNextWord();
	}

	void setup() {
		frame.add(panel);
		panel.add(label);
		panel.add(lives);
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
	tries = 7;
	lives.setText("\n lives: " + String.valueOf(tries));
	System.out.println(characWord);
	frame.pack();
}
 else {
	 JOptionPane.showConfirmDialog(null, "Game Over");
		System.exit(0);
}
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	char pressed = arg0.getKeyChar();
	String newLabel = "";
	String deletedLetters = "";
	if(!characWord.contains("" + pressed)) {
		tries -= 1;
		lives.setText("\n lives: " + String.valueOf(tries));
		if(tries == 0) {
			JOptionPane.showMessageDialog(null, "Aw man you didnt get the word correctly it was " + characWord);
			getNextWord();
			}	
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
	if(!newLabel.contains("_")) {
		JOptionPane.showMessageDialog(null, "You guess the word correctly :)");
		getNextWord();
	}
	}
//if words have been guess move on to the next
	//lose a life
	
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
