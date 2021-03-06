package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton("Start Game");
	ArrayList<String> phrase = new ArrayList<String>();  
	static HangMan game = new HangMan();
public static void main(String[] args) {

game.setup();
}	
	
void setup() {
	frame.add(panel);
	panel.add(label);
	frame.setVisible(true);
	panel.add(button);
	button.addActionListener(this);
	
}
void theHangManGame() {
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(button == pressed) {
		String answer = JOptionPane.showInputDialog(null,"Pick a number up too " + getTotalWordsInFile("dictionary.txt"));
		int finalNumber = Integer.parseInt(answer);
		for(int i = 0; i < phrase.size(); i++) {
			readRandomLineFromFile("dictionary.txt"); 
	}
	}
}
}
