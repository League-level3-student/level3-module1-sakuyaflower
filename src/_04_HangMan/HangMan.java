package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	ArrayList<String> 
	
public static void main(String[] args) {
HangMan game = new HangMan();
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
		String answer = JOptionPane.showInputDialog(null,"Pick a number from 1-266");
		int finalNumber = Integer.parseInt(answer);
	}
}
}
