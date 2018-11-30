package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class AmericaMGExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "América-MG";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 8;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 15;
	}

	@Override
	public int getGoalsScored() {
		return 27;
	}

	@Override
	public int getGoalsConceded() {
		return 39;
	}

	@Override
	public int getPoints() {
		return 34;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: América Futebol Clube", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 30 de abril de 1912", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Belo Horizonte", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Coelho", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio (público): Estádio Independência", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Marcus Salum", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Fernando Leal, Glauco, João Ricardo e Jory", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Aderlan, Norberto, Lima, Matheus Ferraz, Messias, Rafael Lima, Carlinhos e Giovanni", 10, 155, 700, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Christian, David, Juninho, Wesley, Zé Ricardo, Gerson Magrão, Marquinhos", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Matheusinho, Renan Oliveira, Ryu e Serginho", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Aylon, Ademir, Rafael Moura, Luan, Capixaba e Judivan", 10, 200, 500, 14);
		JLabelAPI.addLabel(frame, "Ténico: Enderson Moreira", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Rafael Lima", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série B (1997 e 2017)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série C (2009)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Sul-Minas (2000)", 10, 315, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Mineiro (16 títulos ao total)", 10, 330, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Mineiro - Módulo II (2008)", 10, 345, 500, 14);
		JLabelAPI.addLabel(frame, "Taça Minas Gerais (2005)", 10, 360, 500, 14);
		JLabelAPI.addLabel(frame, "Torneio Início (13 títulos ao total)", 10, 375, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Extra da Cidade de BH (1939)", 10, 390, 500, 14);
	}

}
