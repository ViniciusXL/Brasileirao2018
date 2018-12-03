package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class ChapecoenseExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Chapecoense";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 11;
	}

	@Override
	public int getDraws() {
		return 11;
	}

	@Override
	public int getLosers() {
		return 16;
	}

	@Override
	public int getGoalsScored() {
		return 34;
	}

	@Override
	public int getGoalsConceded() {
		return 50;
	}

	@Override
	public int getPoints() {
		return 44;
	}


	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Associação Chapecoense de Futebol", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 10 de maio de 1973", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Chapecó (SC)", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: índio Condá", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Arena Condá", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Plínio David de Nês Filho", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Jandrei, Elias, Tiepo, Ivan, Igor Campos", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Nery Barreto, Neto, Douglas, Fabricio Bruno, Luiz Otávio, Thyere, Hiago, V. Freitas, Apodi, Bruno, Bruno Pacheco, Eduardo", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Luiz Antônio, Canteros, Moisés Ribeiro, Márcio Araújo, Khevin, Amaral", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Elicarlos, Junior Santos, Nenén, Alan, Nadson, Kendy", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Wellington Paulista, Arthur Caike, Osman Jr, Bruno, Vinicius, Guilherme, Perotti", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Gilson Kleina", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Wellinngton Paulista", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Sul-Americana (2016)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Capeonato Catarinense (1977, 1996, 2007, 2011, 2016 e 2017)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa Santa Catarina (2006)", 10, 315, 500, 14);
	}
}
