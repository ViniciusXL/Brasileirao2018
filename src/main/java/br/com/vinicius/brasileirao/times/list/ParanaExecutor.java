package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class ParanaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Paraná";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 4;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 23;
	}

	@Override
	public int getGoalsScored() {
		return 18;
	}

	@Override
	public int getGoalsConceded() {
		return 57;
	}

	@Override
	public int getPoints() {
		return 23;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Paraná Clube", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 19 de dezembro de 1989", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Curitiba (PR)", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Gralha-Azul", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Durival Britto", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Leonardo Oliveira", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Richard, Thiago Rodrigues, Luís Carlos, Murillo Lopes", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Neris, Charles, Rayan, Alemão, Júnior, Mansur, Igor, Marcelo Baez", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Leandro Vilela, Alex Santana, Wesley Dias, Zezinho, Jhony, Jhonny Lucas, Gabriel Pires, Torito González", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Guilherme Biteco, Warley, Matheus Pereira, Carlos Eduardo", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Lucas Fernandes, Thiago Santos, Diego, Vitor Feijão, Minho, Rodrigo Carioca", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Rogério Micale", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Leandro Vilela", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro - Série B (1992)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Módulo Amarelo da Copa João Havelange (2000)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Paranaese (1991, 1993, 1994, 1994, 1996, 1997 e 2006)", 10, 315, 500, 14);
	}
}
