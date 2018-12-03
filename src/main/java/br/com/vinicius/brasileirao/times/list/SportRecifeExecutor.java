package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class SportRecifeExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Sport Refice";
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
		return 9;
	}

	@Override
	public int getLosers() {
		return 18;
	}

	@Override
	public int getGoalsScored() {
		return 35;
	}

	@Override
	public int getGoalsConceded() {
		return 57;
	}

	@Override
	public int getPoints() {
		return 42;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Sport Clube do Recife", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 13 de maio de 1905", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Recife (PE)", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Leão", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Ilha do Retiro", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Arnaldo Barros Jr.", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Agenor, Magrão, Lucas, Mailson", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Evandro, Felipe R., Raul Prata, Sander, Adryelson, Ernando, Léo Ortiz, Henríquez, Ronaldo Alves, Durval", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Anselmo, Neto Moura, Fabrício, Fellipe Bastos, Nonoca, Andrigo", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Everton Felipe, Gabriel, Marlone e Thomás", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Juninho, Hygor, Rogério e índio", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Nelsinho Baptista", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Ortiz", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa do Brasil (2008)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1987)", 10, 300, 500, 14);
	}
}
