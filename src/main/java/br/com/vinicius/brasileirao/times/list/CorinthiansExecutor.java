package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class CorinthiansExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Corinthians";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 11;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 16;
	}

	@Override
	public int getGoalsScored() {
		return 34;
	}

	@Override
	public int getGoalsConceded() {
		return 35;
	}

	@Override
	public int getPoints() {
		return 44;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Sport Club Corinthians Paulista", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 1 de setembro de 1910", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: São Paulo", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Mosqueteiro", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Arena Corinthians", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Andrés Sanchez", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Cássio, Walter e Caique França", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Henrique, Pedro Henrique, Balbuena, Vilson, Léo Santos, Marllon, Carlos, Fagner e Léo Príncipe", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Jean, Mantuan, Gabriel, Paulo Roberto, Ralf, Renê Junior, Danilo", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Jadson, Mateus Vital, Marquinhos Gabriel e Pedrinho", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Romero, Clayson, Matheus Matias, Emerson Sheik, Roger e Jonathans", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Fábio Carille", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Cássio", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Mundial de Clubes (2000, 2012)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (2012)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1990, 1998, 1999, 2005, 2011, 2015 e 2017)", 10, 315, 500, 14);
	}
}
