import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	private int count=0;
	private JLabel label;
	private JFrame frame;
	private JButton button;
	private JPanel panel;
	
	public GUI() {
		
		//assigns jframe instance
		frame = new JFrame();
		
		//assigns jbutton instance
		button = new JButton("Click me");
		button.addActionListener(this); // implement the actionlistener interface to use this
		
		//assigns jlabel instance
		label = new JLabel("Number of clicks: 0");
		
		//assigns jpanel instance
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 10, 30));
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
	
	//Main method
	public static void main(String[] args) {
		new GUI(); //construtor
	}

	@Override //set the action performed when button is clicked
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of clicks: " + count);
	}
}
