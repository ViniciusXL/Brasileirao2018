package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class AtleticoPRExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Atlético-PR";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 13;
	}

	@Override
	public int getDraws() {
		return 7;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 32;
	}

	@Override
	public int getPoints() {
		return 46;
	}
	
	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Clube Atlético Paranaese", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 26 de março de 1924", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Curitiba (PR)", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Furacão", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio (público): Arena da Baixada", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Luiz Sallim Emed", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Felipe Alves, Léo e Santos", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: José Ivaldo, Paulo André, Thiago Heleno, Wanderson, Gustava Cascardo, Jhonathan, Thiago Carleto e Nicolas", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Nikão, Thiago Rosseto, Matheus Anjos, Rapahel Veiga, Felipe Gedoz, Lucho González", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "João Pedro, Gabriel Baralhas, Gruno Guimarães Esteban Pavez, Camacho e Deivid", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Ederson, Guolherme, Bergson, Marcinho, Pablo e Ribamar", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Fernando Diniz", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Thiago Heleno", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (2001)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Seletiva para a Libertadores (1999)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série B (1995)", 10, 315, 500, 14);
	}

}
