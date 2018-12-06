package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class PalmeirasExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Palmeiras";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 23;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 4;
	}

	@Override
	public int getGoalsScored() {
		return 64;
	}

	@Override
	public int getGoalsConceded() {
		return 26;
	}

	@Override
	public int getPoints() {
		return 80;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Sociedade Esportiva Palmeiras", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 26 de agosto de 1914", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: São Paulo", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Porco", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Allianz Parque", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Maurício Galiotte", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Jailson, Fernando Prass, Weverton e Daniel Fuzato", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Antônio Carlos, Thiago Martins, Edu Dracena, Emerson Santos, Juninho, Luan, Pedrão, Marcos Rocha, Victor Luis, Diogo Barbosa, Jean e Mayke", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Felipe Melo, Bruno Henrique, Lucas Lima, Moisés, Alejandro Guerra, Tchê Tchê", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Michel Bastos, Hyoran e Thiago Santos", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Dudu, Willian, Borja, Keno, Deyverson, Artur e Papagaio", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Felipão", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Dudu", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Rio Internacional (1951)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1960, 1967, 1967, 1969, 1972, 1973, 1993, 1994, 2016 e 2018)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (1998, 2012 e 2015)", 10, 315, 500, 14);
	}
}
