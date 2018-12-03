package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class CruzeiroExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Cruzeiro";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 14;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 34;
	}

	@Override
	public int getGoalsConceded() {
		return 34;
	}

	@Override
	public int getPoints() {
		return 53;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Cruzeiro Esporte Clube", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 2 de Janeiro de 1921", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Belo Horizonte (MG)", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Raposa", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Mineirão", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Wágner Pires de Sá", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Fábio, Rafael, Lucas França, Vitor Eudes", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Digão, Murilo, Léo, Manoel, Dedé, Arthur, Edilson, Ezequiel, Egídio, Marcelo Hermes, Victor Luiz", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Henrique, Lucas Silva, Robinho, Ariel Cabral, Lucas Romero, Bruno Silva", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Mancuello, De Arrascaeta, Thiago Neves, Rafinha", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Raniel, Fred, Rafael Sóbis, Rafael Marques, David, Sassá", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Mano Menezes", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Henrique", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (1976, 1997)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (1993, 1996, 2000, 2003, 2017 e 2018)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1966, 2003, 2013, 2014)", 10, 315, 500, 14);
	}
}
