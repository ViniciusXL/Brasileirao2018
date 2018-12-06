package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class FlamengoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Flamengo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 21;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 8;
	}

	@Override
	public int getGoalsScored() {
		return 59;
	}

	@Override
	public int getGoalsConceded() {
		return 29;
	}

	@Override
	public int getPoints() {
		return 72;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Clube de Regatas Flamengo", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 15 de novembro de 1895", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Rio deJaneiro", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Urubu", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Maracanã e Ilha do Urubu", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Eduardo Bandeira de Mello", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros : Diego Alves, Thiago, César, Gabriel Batista, Júlio César", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores : Réver, Juan, Rodolpho, Léo Duarte, Thuler, Rodinei, Rene, Pará, Trauco, Kleber", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas : Diego, Éverton, Éverton Ribeiro, Lucas Paquetá, Éderson, Cuéllar, Jonas, Rômulo", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "William Arão, Ronaldo, Jajá, Jean Lucas", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante : Paolo Guerrero, Henrique Dourado, Vinícius Júnior, Felipe Vizeu, Lincoln, Geuvânio, Berrío, Marlos Moreno", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Maurício Barbieri", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Réver", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (1981)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Intercontinental (1981)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasilerio (1980, 1982, 1983, 1992 e 2009)", 10, 315, 500, 14);
	}
}
