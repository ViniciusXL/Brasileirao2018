package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class VitoriaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Vitória";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 9;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 19;
	}

	@Override
	public int getGoalsScored() {
		return 36;
	}

	@Override
	public int getGoalsConceded() {
		return 63;
	}

	@Override
	public int getPoints() {
		return 37;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Esporte Clube Vitória", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 13 de maio de 1899", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Belo Horizonte", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Leão", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Manoel Barradas", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Ricardo David", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Ronaldo, Fernando Miguel e Caíque", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Walisson Maia, Josué, Léo Xavier, Ramon, Kanu, Bruno, Pedro Botelho, Lucas, Bryan, Juninho e Cedric", 10, 155, 700, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Rodrigo Andrade, Léo Gomes, Lucas Marques, Filippe Soutto, Uillian Correia", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Willian Farias, José Welison, Guilherme Costa, Baumjohann, Nickson, Yago, Jhemerson e Cleiton Xavier", 10, 185, 700, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Jonatas Belusso, Flávio, Luan, Denílson, Neílton, Rhayner, Júnior e André Lima", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Vagner Mancini", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Fernando Miguel", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa do Nordeste (1997, 1999, 2003 e 2010)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Torneio José Américo de Almeida Filho (1976)", 10, 300, 500, 14);
	}

}
