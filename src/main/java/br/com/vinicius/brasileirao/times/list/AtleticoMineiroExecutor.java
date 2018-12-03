package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class AtleticoMineiroExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Atlético Mineiro";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 17;
	}

	@Override
	public int getDraws() {
		return 8;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 56;
	}

	@Override
	public int getGoalsConceded() {
		return 43;
	}

	@Override
	public int getPoints() {
		return 59;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Clube Atlético Mineiro", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 25 de março de 1908", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Belo Horizonte", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Galo", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio (público): Independência (23 018)", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Alexandre Campello", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Victor, Giovanni, Uilson, Cleiton, Michael", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Leo Silva, Gabriel, Felipe Santana, Matheus, Bremer, Maidana, Fábio Santos, Danilo, Samuel Xavier, Patric e César", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Lucas Cândido, Juan Cazares, Otero, Yago, Elias, Adilson, Roger, Gustavo Blanco", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Arouca, Tomás Andrade, Bruno Roberto e Marquinhos", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Luan, Ricardo Oliveira, Roger Guedes, Clayton, Erik, Marco Túlio, Hyuri Carlos e Alerrandro", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Thiago Larghi", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Martín Silva", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (2013)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa CONMEBOL (1992, 1997)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Recopa Sul-Americana (2014)", 10, 315, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1971)", 10, 330, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (2014)", 10, 345, 500, 14);
	}
}
