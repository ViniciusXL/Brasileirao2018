package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class SaoPauloExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "São Paulo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 16;
	}

	@Override
	public int getDraws() {
		return 15;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 34;
	}

	@Override
	public int getPoints() {
		return 63;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: São Paulo Futebol Clube", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 25 de janeiro de 1930", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: São Paulo", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Santo Paulo", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Morumbi", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Carlos Augusto de Barros e Silva (Leco)", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Sidão, Jean, Lucas Perri e Lucas Paes", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Arboleda, Rodrigo Caio, Bruno Alves, Aderllan, Anderson Martins, Reinaldo, Bruno, Eder Militão, Junior Tavares, Edimar e Regis", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas : Cueva, Petros, Jucilei, Nenê, Liziero, Hudson, Lucas Fernandes, Shaylon", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Valdívia, Paulo Henrique, Araruna, Diego Souza e Marcos Guilherme", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante : Trellez, Carneiro, Brenner, Morato, Caíque, Paulinho e Bissoli", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Técnico : Diego Aguirre", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Sidão", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa do Mundo de Clubes da FIFA (2005)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (1992, 1993, 2005)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1997, 1986, 1991, 2006, 2007 e 2008)", 10, 315, 500, 14);
	}
}
