package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class BahiaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Bahia";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 12;
	}

	@Override
	public int getGoalsScored() {
		return 35;
	}

	@Override
	public int getGoalsConceded() {
		return 38;
	}

	@Override
	public int getPoints() {
		return 41;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Esporte Clube Bahia", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 1 de janeiro de 1931", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Salvador", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Super-homem", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Arena Fonte Nova", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Guilherme Bellintani", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Douglas Friedrich, Anderson, Rafael Santos e Cassiano", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: João Pedro, Léo, Mena, Nino Paraíba, Douglas Grolli, Everson, Jackson, Lucas Fonseca, Rodrigo Becão e Tiago", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Allione, Edson, Régis, Vinícius, Nilton, Elton, Flavio,", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Gregore, Marco Antônio e Zé Rafael", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Edigar Junio, Élber, Junior Brumado, Geovane Itinga e Kayke", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Guto Ferreira", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Tiago", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1959 e 1988)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Nordeste (2001, 2002 e 2017)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Torneio dos Campeões do Nordeste (1948)", 10, 315, 500, 14);
	}
}
