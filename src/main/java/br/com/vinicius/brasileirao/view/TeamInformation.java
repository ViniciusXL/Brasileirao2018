package br.com.vinicius.brasileirao.view;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.Times;

public class TeamInformation extends JFrame {

	private static final long serialVersionUID = 1L;

	private final Times time;
	
	public TeamInformation(Times time) {
		this.time = time;
		
		setTitle("Informação do time: " + this.time.getName());
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(605, 490);

		this.time.getExecutor().setInformation(this);
	}
}
