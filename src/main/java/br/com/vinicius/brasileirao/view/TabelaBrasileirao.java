package br.com.vinicius.brasileirao.view;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.Times;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class TabelaBrasileirao {
	
	private JFrame frame;

	public TabelaBrasileirao() {
		this.frame = new JFrame("Tabela Brasileirão 2018");
		this.frame.getContentPane().setLayout(null);
		
		this.setLabels();
		this.addPositions(30);
		this.addTeams(30);
	}
	
	public final JFrame getFrame() {
		return this.frame;
	}
	
	protected final void setLabels() {
		JLabelAPI.addLabel(frame, "Posição", 10, 10, 46, 14);
		JLabelAPI.addLabel(frame, "Nome", 65, 11, 46, 14);
		JLabelAPI.addLabel(frame, "PG", 378, 11, 46, 14);
		JLabelAPI.addLabel(frame, "J", 405, 11, 46, 14);
		JLabelAPI.addLabel(frame, "V", 427, 11, 46, 14);
		JLabelAPI.addLabel(frame, "E", 449, 11, 46, 14);
		JLabelAPI.addLabel(frame, "D", 471, 11, 46, 14);
		JLabelAPI.addLabel(frame, "GP", 492, 11, 46, 14);
		JLabelAPI.addLabel(frame, "GC", 520, 11, 46, 14);
		JLabelAPI.addLabel(frame, "SG", 547, 11, 46, 14);
	}
	
	protected final void addPositions(int y) {
		for (int i = 1; i <= 20; i++) {
			JLabelAPI.addLabel(frame, String.valueOf(i), 25, y, 46, 14);
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
			
			JLabelAPI.addLabel(frame, time.getName(), 65, y, 100, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getPoints()), 378, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getGames()), 405, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getWins()), 427, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getDraws()), 449, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getLosers()), 471, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getGoalsScored()), 492, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getGoalsConceded()), 520, y, 46, 14);
			JLabelAPI.addLabel(frame, String.valueOf(time.getGoalsDifference()), 547, y, 46, 14);
			
			y += 18;
		}
	}
}
