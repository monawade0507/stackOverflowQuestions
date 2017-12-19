package question;

import java.awt.BorderLayout;

import javax.swing.*;

public class text
{
	public static void main(String Args[])
	{
		/*
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JTextArea text = new JTextArea("Hello World");
		text.setVisible(true);
		text.setSize(100, 100);
		panel.add(text);
		panel.setVisible(true);
		panel.setSize(200,200);
		panel.setLayout(new BorderLayout());
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500,500);
		*/
		
		JFrame frame = new JFrame();
	    JPanel panel = new JPanel();
	    JTextArea area = new JTextArea();
	    area.setVisible(true);
	    area.setSize(100, 100);
	    panel.add(area);
	    frame.add(panel); 
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setVisible(true);
	}
		
}