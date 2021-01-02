import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	public GUI() {
		
		//create jframe object
		JFrame frame = new JFrame();
		
		//creates button object
		JButton button = new JButton("Click me");
		button.addActionListener(this); // implement the actionlistener interface to use this
		
		//creates label object
		JLabel label = new JLabel("Number of clicks:0");
		
		//create jpanel object
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button); //import button object
		panel.add(label); //import label object
		
		//set up frame
		frame.add(panel, BorderLayout.CENTER); //add panel to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens on close of frame
		frame.setTitle("Our GUI"); //set title of window
		frame.pack(); //set window to match a size
		frame.setVisible(true); //make window visible and in focus
	}
	
	public static void main(String[] args) {
		new GUI(); //construtor
	}
}
