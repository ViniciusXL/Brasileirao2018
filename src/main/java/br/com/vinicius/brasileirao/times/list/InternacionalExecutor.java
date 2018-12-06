package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class InternacionalExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Internacional";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 19;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 7;
	}

	@Override
	public int getGoalsScored() {
		return 51;
	}

	@Override
	public int getGoalsConceded() {
		return 29;
	}

	@Override
	public int getPoints() {
		return 69;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Sport Club Internacional", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 4 de abriel de 1909", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Porto Alegre", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Saci", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Beira-Rio", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Marcelo Medeiros", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Marcelo Lomba, Danilo Fernandes, Daniel e Keiller", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Madson, Marcelo Oliveira, Cortez, Leonardo Gomes, Léo Moura, Geromel, Kannemann, Paulo Miranda, Bressan e Gabriel", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Charles, Fabinho, Gabriel Dias, Rodrigo Dourado, Edenílson, Patrick, Camilo", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "D'Alessandro, Juan Alano e Richard", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacantes: Brenner, Leandro Damião, Marcinho, Nico López, Ronald, Rossi, Wellington Silva, William Pottker e Lucca", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Odair Hellman", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: D'Alessandro", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa do Mundi de Clubes da FIFA (2006)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (2006 e 2010)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1975, 1976 e 1979)", 10, 315, 500, 14);
	}
}
