package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class VascoDaGamaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Vasco da Gama";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 13;
	}

	@Override
	public int getLosers() {
		return 15;
	}

	@Override
	public int getGoalsScored() {
		return 41;
	}

	@Override
	public int getGoalsConceded() {
		return 48;
	}

	@Override
	public int getPoints() {
		return 43;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Club de Regatas Vasco da Gama", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 21 de agosto de 1898", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Rio de Janeiro", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Almirante", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: São Januário", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Alexandre Campello", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Martín Silva, Gabriel Félix e João Pedro", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Erazo, Werley, Luiz Gustavo, Ricardo, Breno, Paulão, Fabrício, Henrique Silva, R.Galhardo, Yago Pikachu, Alan Cardoso e Ramon", 10, 155, 700, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Wagner, Evander, Thiago Galhardo, Giovanni Augusto, Marcelo Mattos, Desábato, Andrey", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Bruno Cosendey, Wellington e Bruno Paulista", 10, 185, 700, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Andrés Ríos, Kelvin, Riascos, Rildo, Caio Monteiro, Paulo Vitor e Paulinho", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Zé Ricardo", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Martín Silva", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série A (1974, 1989, 1997 e 2000)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série B (2009)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (2011)", 10, 315, 500, 14);
	}
	
}
