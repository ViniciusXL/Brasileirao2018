package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class CearaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Ceará";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 14;
	}

	@Override
	public int getLosers() {
		return 14;
	}

	@Override
	public int getGoalsScored() {
		return 32;
	}

	@Override
	public int getGoalsConceded() {
		return 38;
	}

	@Override
	public int getPoints() {
		return 44;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Ceará Sporting Club", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 2 de junho de 1914", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Fortaleza", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Vovô", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Arena Castelão", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Robinson de Castro", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Everson, Fernando Henrique e Renan", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Bruno Pires, Luiz Otávio, Patrick, Rafel Pereira, Tiago Alves, Valdo, Leandro Silva, Pio, Arnaldo, Felipe Jonatan, Rafel Carioca e Romário", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Ernandes, Jackson Caucaia, Juninho, Naldo, Pedro Ken, Raul, Richardson", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Leandro Canhoto, Reina, Ricardinho e Wescley", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Alex Amado, Arthur, Douglas Coutinho, Elton, Felipe Azevedo, Luidy, Rafinha e Roberto", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Marcelo Chamusca", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Ricardinho", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Torneio Norte-Nordeste (1969)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Nordeste (2015)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Cearense (45 títulos)", 10, 315, 500, 14);
	}
}
