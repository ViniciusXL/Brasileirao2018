package br.com.vinicius.brasileirao.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import br.com.vinicius.brasileirao.times.Times;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class TabelaBrasileirao extends JFrame {

	private static final long serialVersionUID = 1L;

	public TabelaBrasileirao() {
		setTitle("Tabela Brasileirão 2018");
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(605, 490);
		
		this.setLabels();
		this.addPositions(30);
		this.addTeams(30);
		this.addButton();
	}
	
	public final JFrame getFrame() {
		return this;
	}
	
	protected final void setLabels() {
		JLabelAPI.addLabel(this, "Posição", 10, 10, 46, 14);
		JLabelAPI.addLabel(this, "Nome", 65, 11, 46, 14);
		JLabelAPI.addLabel(this, "PG", 378, 11, 46, 14);
		JLabelAPI.addLabel(this, "J", 405, 11, 46, 14);
		JLabelAPI.addLabel(this, "V", 427, 11, 46, 14);
		JLabelAPI.addLabel(this, "E", 449, 11, 46, 14);
		JLabelAPI.addLabel(this, "D", 471, 11, 46, 14);
		JLabelAPI.addLabel(this, "GP", 492, 11, 46, 14);
		JLabelAPI.addLabel(this, "GC", 520, 11, 46, 14);
		JLabelAPI.addLabel(this, "SG", 547, 11, 46, 14);
	}
	
	protected final void addPositions(int y) {
		for (int i = 1; i <= 20; i++) {
			JLabelAPI.addLabel(this, String.valueOf(i), 25, y, 46, 14);
			y += 18;
		}
	}
	
	protected final void addTeams(int y) {
		List<Times> teamList = Times
				.getTeams((a, b) -> Integer.valueOf(b.getGoalsDifference()).compareTo(a.getGoalsDifference()));
		teamList = teamList.stream().sorted((a, b) -> Integer.valueOf(b.getPoints()).compareTo(a.getPoints()))
				.collect(Collectors.toList());
		for (int i = 0; i <= 19; i++) {
			Times time = teamList.get(i);
			
			JLabelAPI.addLabel(this, time.getName(), 65, y, 100, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getPoints()), 378, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getGames()), 405, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getWins()), 427, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getDraws()), 449, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getLosers()), 471, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getGoalsScored()), 492, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getGoalsConceded()), 520, y, 46, 14);
			JLabelAPI.addLabel(this, String.valueOf(time.getGoalsDifference()), 547, y, 46, 14);
			
			y += 18;
		}
	}
	
	public final void addButton() {
		JLabelAPI.addLabel(this, "Digite o nome do time para pesquisar", 130, 395, 400, 20);
		
		JTextPane pane = new JTextPane();
		pane.setBounds(135, 415, 200, 20);
		getContentPane().add(pane);
		
		JButton button = new JButton("Pesquisar");
		button.addMouseListener(this.mouseEvent(pane));
		button.setBounds(340, 415, 92, 19);
		getContentPane().add(button);
	}
	
	protected final MouseAdapter mouseEvent(JTextPane pane) {
		MouseAdapter adapter = new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Times time = Times.findTeam(pane.getText());
				if (time == null) {
					pane.setText("Time não encontrado!");
					return;
				}
				
				new TeamInformation(time);
			}
		};
		
		return adapter;
	}
}
