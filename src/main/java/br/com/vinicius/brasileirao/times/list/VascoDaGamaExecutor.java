package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

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

}
