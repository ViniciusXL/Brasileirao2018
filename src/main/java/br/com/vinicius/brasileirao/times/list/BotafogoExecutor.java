package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class BotafogoExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Botafogo";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 13;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 13;
	}

	@Override
	public int getGoalsScored() {
		return 38;
	}

	@Override
	public int getGoalsConceded() {
		return 46;
	}

	@Override
	public int getPoints() {
		return 51;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Botafogo de Futebol e Regatas", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 12 de agosto de 1904", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Rio de Janeiro", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Manequinho", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Nilton Santos", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Nelson Mufarrej", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Gatito Fernández, Jefferson e Saulo", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Igor Rabelo, Joel Carli, Marcelo, Kanu, Helerson, Yago, Moisés, Arnaldo, Luis Ricardo, Marcinho, Gilson e Yuri", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Macelo, Bochecha, Dudu Cearense, Matheus Fernandes, Rodrigo Lindoso, Renatinho", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "João Paulo, Leo Valencia, Marcos Vinicius, Luiz Fernando e Leandro", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Rodrigo Pimpão, Brenner, Keisa, Aguirre, Ezequiel, Lucas Campos, Leandro Carvalho e Pachu", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Alberto Valentim", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Joel Carli", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1968 e 1995)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Nordeste (2015)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Conmebol (1993)", 10, 315, 500, 14);
	}
}
