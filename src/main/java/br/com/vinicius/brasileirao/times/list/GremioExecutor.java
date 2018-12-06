package br.com.vinicius.brasileirao.times.list;

import javax.swing.JFrame;

import br.com.vinicius.brasileirao.times.TimesExecutor;
import br.com.vinicius.brasileirao.view.util.JLabelAPI;

public class GremioExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Grêmio";
	}

	@Override
	public int getGames() {
		return 38;
	}

	@Override
	public int getWins() {
		return 18;
	}

	@Override
	public int getDraws() {
		return 12;
	}

	@Override
	public int getLosers() {
		return 8;
	}

	@Override
	public int getGoalsScored() {
		return 48;
	}

	@Override
	public int getGoalsConceded() {
		return 27;
	}

	@Override
	public int getPoints() {
		return 66;
	}

	@Override
	public void setInformation(JFrame frame) {
		JLabelAPI.addLabel(frame, "Nome oficial: Grêmio Foot-Ball Porto Alegrense", 10, 10, 500, 14);
		JLabelAPI.addLabel(frame, "Fundação: 15 de setembro de 1903", 10, 25, 500, 14);
		JLabelAPI.addLabel(frame, "Cidade: Porto Alegre", 10, 40, 500, 14);
		JLabelAPI.addLabel(frame, "Mascote: Mosqueteiro", 10, 55, 500, 14);
		JLabelAPI.addLabel(frame, "Estádio: Arena do Grêmio", 10, 70, 500, 14);
		JLabelAPI.addLabel(frame, "Presidente: Romildo Bolzan Junior", 10, 85, 500, 14);
		
		// ELENCO //
		
		JLabelAPI.addLabel(frame, "ELENCO DO CLUBE", 10, 115, 500, 14);
		
		JLabelAPI.addLabel(frame, "Goleiros: Marcelo Grohe, Paulo Victor, Leo, Bruno Grassi e Brenno", 10, 140, 500, 14);
		JLabelAPI.addLabel(frame, "Defensores: Madson, Marcelo Oliveira, Cortez, Leonardo Gomes, Léo Moura, Geromel, Kannemann, Paulo Miranda, Bressan e Gabriel", 10, 155, 900, 14);
		
		JLabelAPI.addLabel(frame, "Meio-campistas: Kaiko, Lima, Maicon, Matheus Henrique, Michel, Ramiro, Thaciano, Thonny Anderson", 10, 170, 700, 14);
		JLabelAPI.addLabel(frame, "Arthur Cícero, Douglas e Jailson", 10, 185, 500, 14);
		
		JLabelAPI.addLabel(frame, "Atacante: Luan, Jael, Hernane Brocador, Lucas Paletto, Maicosuel, Vico, Alisson, André, Dionathá e Everton", 10, 200, 700, 14);
		JLabelAPI.addLabel(frame, "Ténico: Renato Portaluppi", 10, 215, 500, 14);
		JLabelAPI.addLabel(frame, "Capitão: Revezamento a cada partida", 10, 230, 500, 14);
		
		// TÍTULOS //
		
		JLabelAPI.addLabel(frame, "TÍTULOS DO CLUBE (Principais)", 10, 260, 500, 14);
		
		JLabelAPI.addLabel(frame, "Copa Intercontinental (1983)", 10, 285, 500, 14);
		JLabelAPI.addLabel(frame, "Campeonato Brasileiro (1981 e 1996)", 10, 300, 500, 14);
		JLabelAPI.addLabel(frame, "Copa do Brasil (1989, 1994, 1997, 2001 e 2016)", 10, 315, 500, 14);
	}
}
