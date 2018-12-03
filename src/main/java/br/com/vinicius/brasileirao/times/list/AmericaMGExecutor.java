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
		return 38;
	}

	@Override
	public int getWins() {
		return 10;
	}

	@Override
	public int getDraws() {
		return 10;
	}

	@Override
	public int getLosers() {
		return 18;
	}

	@Override
	public int getGoalsScored() {
		return 30;
	}

	@Override
	public int getGoalsConceded() {
		return 47;
	}

	@Override
	public int getPoints() {
		return 40;
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
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série B (1997 e 2017)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série C (2009)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Mineiro (16 títulos ao total)", 10, 315, 500, 14);
	}

}
