package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class FluminenseExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Fluminense";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 12;
	}

	@Override
	public int getDraws() {
		return 9;
	}

	@Override
	public int getLosers() {
		return 17;
	}

	@Override
	public int getGoalsScored() {
		return 32;
	}

	@Override
	public int getGoalsConceded() {
		return 42;
	}

	@Override
	public int getPoints() {
		return 45;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Fluminense Footbal Club", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 21 de julho de 1902", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Rio deJaneiro", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Guerreiro", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Maracanã", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Pedro Abad", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros : Júlio César, Marcos Felipe, Rodolfo, De Amores", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores : Gum, Renato Chaves, Ibañez, Reginaldo, Wesley Frazan, Gilberto, Léo, Marlon, Ayrton Lucas, Diogo", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas : Richard, Jadson, Sornoza, Caio, Airton, Marlon Freitas, Mateus Norton", 10, 170, 700, 14);
		//JLabelAPI.addLabel(frame, "D'Alessandro, Juan Alano e Richard", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante : Robinho, Marcos Júnior, Pedro, Romarinho, Pablo Dyego, Marquinhos Calazans, Luiz Fernando, Luquinhas, Alessandro", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Abel Braga", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Gum", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1970, 1984, 2010 e 2012)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (2007)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série C (1999)", 10, 315, 500, 14);
	}
}
