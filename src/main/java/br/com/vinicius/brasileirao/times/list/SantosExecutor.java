package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class SantosExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Santos";
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
		return 11;
	}

	@Override
	public int getLosers() {
		return 14;
	}

	@Override
	public int getGoalsScored() {
		return 46;
	}

	@Override
	public int getGoalsConceded() {
		return 40;
	}

	@Override
	public int getPoints() {
		return 50;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Santos Futebol Clube", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 14 de abril de 1912", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: São Paulo", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Baleia", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Vila Belmiro", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: José Carlos Peres", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Vanderlei, Vladimir e João Paulo", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Lucas Veríssimo, David Braz, Luiz Felipe, Gustavo Henrique, Robson Mambu, Matheus Guedes, Cleber Reis, Dodô, Daniel Guedes, Emerson, Victor Ferraz e Caju", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Alison, Renato, Léo Cittadini, Leandro Donizete, Guilherme Nunes, Lucas Lourenço, Victor Yan", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Gabriel Calabres, Emiliano Vecchio, Yuri, Jean Mota e Vitor Bueno", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Eduardo Sasha, Gabriel, Rodrygo, Bruno Henrique, Yuri Alberto, Arthur Gomes, Copete, Diogot Vitor e Rodrigão", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Jair Ventura", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Renato ou David Braz", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Libertadores da América (1962, 1963, 2011)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (2010)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1961, 1962, 1693, 1964, 1965, 1968, 2002 e 2004)", 10, 315, 500, 14);
	}
}
