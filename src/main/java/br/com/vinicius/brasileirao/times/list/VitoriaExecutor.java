package br.com.vinicius.brasileirao.times.list;

import br.com.vinicius.brasileirao.times.TimesExecutor;

public class VitoriaExecutor extends TimesExecutor {

	@Override
	public String getName() {
		return "Vitória";
	}

	@Override
	public int getGames() {
		return 33;
	}

	@Override
	public int getWins() {
		return 9;
	}

	@Override
	public int getDraws() {
		return 8;
	}

	@Override
	public int getLosers() {
		return 16;
	}

	@Override
	public int getGoalsScored() {
		return 33;
	}

	@Override
	public int getGoalsConceded() {
		return 55;
	}

	@Override
	public int getPoints() {
		return 35;
	}

}
