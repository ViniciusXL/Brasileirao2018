package br.com.vinicius.brasileirao.view.util;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class JLabelAPI {

	public static void addLabel(JFrame frame, String name, int x, int y, int width, int height) {
		JLabel label = new JLabel(name);
		label.setBounds(x, y, width, height);
		frame.getContentPane().add(label);
	}
	
	public static void addText(JFrame frame, int x, int y, int width, int height) {
		JTextPane pane = new JTextPane();
		pane.setBounds(x, y, width, height);
		frame.getContentPane().add(pane);
	}
}
